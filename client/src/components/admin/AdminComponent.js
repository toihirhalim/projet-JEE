import React from 'react'
import useAdminToken from '../../auth/useAdminToken'


export default function AdminComponent({ token, admin, reload, setReload, setError }) {
    const { logout } = useAdminToken
    const deleteAdmin = () => {
        let url = 'http://localhost:8080/admin/delete/' + admin.id
        fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(token)
        })
            .then(res => {
                if (token.email === admin.email) {
                    logout()
                }
                setReload(!reload)
            })
            .catch(e => setError('Error : something went wrong please verrify your connexion !'))
    }

    return (
        <div className="admin-compt">
            <p>Nom : {admin.name}</p>
            <p>Email : {admin.email}</p>
            <p>Password : {admin.password}</p>
            <button className="delete-btn" onClick={deleteAdmin}>Delete</button>
        </div>
    )
}
