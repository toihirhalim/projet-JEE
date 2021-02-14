import React, { useState } from 'react'

export default function SentenceForm({ setMedcins, setError, setLoading }) {
    const [syptomes, setSyptomes] = useState('')

    const search = () => {

        setError(null)
        setMedcins([])
        if (syptomes.length <= 0) {
            setError('Error : Pleaase enter symptomes')
            return;
        }
        setLoading(true)
        fetch('http://localhost:8080/search/syptomes', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ syptomes })
        })
            .then(res => res.json())
            .then(data => {
                if (data.length === 0)
                    setError('Error : No doctor Available for these Symptoms')
                setMedcins(data)
                setLoading(false)
            })
            .catch(e => {
                setError("Error : something went wrong, please verrify the connection")
                setLoading(false)
            })
    }
    return (
        <div id="sentecnce-form">
            <label>symptomes : </label>
            <input type="text" value={syptomes} onChange={e => setSyptomes(e.target.value)} maxLength="55" />
            <button onClick={search}>search</button>
        </div>
    )
}
