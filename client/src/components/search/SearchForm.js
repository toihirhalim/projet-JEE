import React from 'react'
import './searchForm.css'
import SelectForm from './SelectForm'
import SentenceForm from './SentenceForm'

export default function SearchForm({ setMedcins, setError, setLoading }) {
    return (
        <div id="search-form">
            <div className="search-part">
                <SelectForm
                    setMedcins={setMedcins}
                    setError={setError}
                    setLoading={setLoading}
                />
            </div>
            <div className="search-part">
                <SentenceForm
                    setMedcins={setMedcins}
                    setError={setError}
                    setLoading={setLoading}
                />
            </div>
        </div>
    )
}
