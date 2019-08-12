import React from 'react';
import Home from './components/Home'
import {HashRouter} from 'react-router-dom'
import {library} from '@fortawesome/fontawesome-svg-core'
import {faPlus} from '@fortawesome/free-solid-svg-icons'

function App() {
    loadIcons()
  return (
    <div className="App">
        <HashRouter>
            <Home></Home>
        </HashRouter>
    </div>
  );
}

function loadIcons(){
    library.add(
        faPlus,
        )
}

export default App;
