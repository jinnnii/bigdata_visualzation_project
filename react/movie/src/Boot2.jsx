import React, { Component } from 'react';
import Header from './components/Header';
import Main from './components/Main';
import Footer from './components/Footer';

import 'bootstrap/dist/css/bootstrap.min.css';

export default class Boot2 extends Component {
    render() {
        return (
            <>
                <Header />
                <Main />
                <Footer />
            </>
        );
    }
}
