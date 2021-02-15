import React, { useState } from 'react'

export default function InscriptionClinique() {
    const [name, setName] = useState('')
    const [email, setEmail] = useState('')
    const [publicEmail, setPublicEmail] = useState('')
    const [speciality, setSpeciality] = useState('')
    const [ville, setVille] = useState('')
    const [cliniqueName, setCliniqueName] = useState('')
    const [number, setNumber] = useState('')
    const [oppenAt, setOppenAt] = useState('')
    const [closeAt, setCloseAt] = useState('')
    const [adress, setAdress] = useState('')
    const [webSiteName, setWebSiteName] = useState('')
    const [webSiteUrl, setWebSiteUrl] = useState('')

    const handleSubmit = e => {
        e.preventDefault()

        console.log('fetching ...')
    }
    return (
        <div>
            <div className="container">
                <h1 className="title-frm">Inscrivez votre Organization ( Clinique )</h1>
            </div>
            <div className="container">
                <form onSubmit={handleSubmit}>
                    <div className="form-elm-dmd">
                        <h3>Enter your ful Name : </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={name}
                            onChange={e => { setName(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Enter your private Email : </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={email}
                            onChange={e => { setEmail(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Enter your public Email: </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={publicEmail}
                            onChange={e => { setPublicEmail(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Enter your Speciality: </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={speciality}
                            onChange={e => { setSpeciality(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Enter your City : </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={ville}
                            onChange={e => { setVille(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Enter your ful Name : </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={cliniqueName}
                            onChange={e => { setCliniqueName(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Enter your phone Number : </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={number}
                            onChange={e => { setNumber(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Clinique oppen at :</h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={oppenAt}
                            onChange={e => { setOppenAt(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Clinique Close At : </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={closeAt}
                            onChange={e => { setCloseAt(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Enter Localation Adress : </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={adress}
                            onChange={e => { setAdress(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Enter your web site Name : </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={webSiteName}
                            onChange={e => { setWebSiteName(e.target.value) }}
                        />
                    </div>
                    <div className="form-elm-dmd">
                        <h3>Enter your web site Url : </h3>
                        <input
                            type="texte"
                            className="form-input-dmd"
                            value={webSiteUrl}
                            onChange={e => { setWebSiteUrl(e.target.value) }}
                        />
                    </div>
                    <div>
                        <button className="submit-frm-demd" type="submit">Submit Your Request</button>
                    </div>
                </form>
            </div>
        </div>
    )
}
