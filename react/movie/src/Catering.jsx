import React, { Component } from 'react';
import CateringHeader from './components/CateringHeader';
import CateringFooter from './components/CateringFooter';

import CateringAbout from './routes/CateringAbout';
import CateringContact from './routes/CateringContact';
import CateringMenu from './routes/CateringMenu';
import { HashRouter, Route } from 'react-router-dom';
import CateringHome from './routes/CateringHome';

export default class Catering extends Component {
    render() {
        return (
            <>
                <HashRouter>
                    <CateringHeader />
                    <Route path="/" component={CateringHome} exact={true} />
                    <Route path="/about" component={CateringAbout} />
                    <Route path="/menu" component={CateringMenu} />
                    <Route path="/contact" component={CateringContact} />
                </HashRouter>
                <CateringFooter />
            </>
        );
    }
}
