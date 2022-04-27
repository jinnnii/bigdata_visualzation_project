import React, { Component } from 'react';
import { Link } from 'react-router-dom';

export default class CateringHeader extends Component {
    render() {
        return (
            <nav className="navbar navbar-expand-sm  shadow-sm sticky-top bg-white">
                <div className="container-fluid p-2">
                    <a href="#" className="navbar-brand ">
                        Gourmet au Catering
                    </a>
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <a href="#" className="nav-link">
                                About
                            </a>
                        </li>
                        <li className="nav-item">
                            <a href="#" className="nav-link">
                                Menu
                            </a>
                        </li>
                        <li className="nav-item">
                            <a href="#" className="nav-link">
                                Contact
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        );
    }
}
