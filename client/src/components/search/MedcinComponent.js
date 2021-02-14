import React from 'react'
import './searchForm.css'

export default function MedcinComponent({ medcin }) {

    const reserver = () => {
        console.log('reservation ...');
    }
    return (
        <div className="medcin">
            <div className="medcin-header">
                <h2>DR. {medcin.name}</h2>
                <h3>{medcin.clinique.name}</h3>
            </div>
            <div className="medcin-center">
                <h3>{medcin.speciality}</h3>
                <button className="reserver-btn" onClick={reserver}>reserver</button>
                <p>Oppen at : {medcin.clinique.oppenAt} CloseAt : {medcin.clinique.closeAt}</p>
            </div>
            <div className="medcin-footer">
                <div className="medcin-footer-elm">
                    <p>Ville :</p>
                    <p className="medcin-infos">{medcin.ville}</p>
                </div>
                <div className="medcin-footer-elm">
                    <p>Adress :</p>
                    <p className="medcin-infos">{medcin.clinique.adress.location}</p>
                </div>
                <div className="medcin-footer-elm">
                    <p>Tel :</p>
                    <p className="medcin-infos">{medcin.clinique.number}</p>
                </div>
                <div className="medcin-footer-elm">
                    <p>web Site :</p>
                    <p className="medcin-infos">
                        <a href={medcin.clinique.webSite.url} target="blanck">{medcin.clinique.webSite.name}</a>
                    </p>
                </div>
            </div>
        </div>
    )
}
