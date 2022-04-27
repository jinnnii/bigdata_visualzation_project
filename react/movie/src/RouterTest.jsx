import React, { Component } from 'react';
import { HashRouter, Route } from 'react-router-dom';
import About from './routes/About';
import Home from './routes/Home';
import Detail from './routes/Detail';
import Navigation from './components/Navigation';

export default class RouterTest extends Component {
    render() {
        return (
            <HashRouter>
                <Navigation />
                <Route path="/" component={Home} exact={true} />
                <Route path="/about" component={About} />
                <Route path="/movie-detail" component={Detail} />
            </HashRouter>
        );
    }
}
