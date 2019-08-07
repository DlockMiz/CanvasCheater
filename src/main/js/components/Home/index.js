import React, {Component} from 'react'
import {Navbar, Nav} from 'react-bootstrap'
import {Route, NavLink} from "react-router-dom";
import Classes from "../Classes"

class Home extends Component {
    render() {
        return(
            <div>
                <Navbar bg="dark" variant="dark">
                    <Navbar.Brand as={NavLink} to="/">Canvas Cheater</Navbar.Brand>
                    <Nav className="mr-auto">
                        <Nav.Link as={NavLink} to="/classes"> Classes</Nav.Link>
                        <Nav.Link as={NavLink} to="/assignments"> Other</Nav.Link>
                        <Nav.Link as={NavLink} to="/other"> Other</Nav.Link>
                    </Nav>
                </Navbar>
                <Route path="/"/>
                <Route path="/classes" component={Classes}/>
            </div>
        )
    }
}

export default Home