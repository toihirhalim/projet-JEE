import React from 'react'
import MedcinComponent from './MedcinComponent'

import ClipLoader from "react-spinners/ClipLoader";

export default function SearchResults({ medcins, error, isLoading }) {

    const override = { display: "block", margin: '20px auto', 'borderColor': 'black' }
    return (
        <div>
            {
                medcins.map(medcin => {
                    return (
                        <MedcinComponent
                            key={medcin.id}
                            medcin={medcin}
                        />
                    )
                })
            }
            {error &&
                <div id="search-error">
                    <p>{error}</p>
                </div>
            }
            <ClipLoader loading={isLoading} css={override} size={50} />
        </div>
    )
}
