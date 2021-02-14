import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Admin from './pages/Admin'
import Acceuil from './pages/Acceuil'
import './App.css';

function App() {
  return (
    <div className="App">
      <header>
        <div className="container header-container">
          <div className="logo">
            <a href="acceuil">logo</a>
          </div>
          <div>
            <a href="#inscriptionform">
              <button>Inscrire votre Clinique</button>
            </a>
          </div>
        </div>
      </header>
      <BrowserRouter>
        <Switch>
          <Route path="/admin">
            <Admin />
          </Route>
          <Route path="/acceuil">
            <Acceuil />
          </Route>
          <Route path="">
            <Acceuil />
          </Route>
        </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;
