import React, { Component } from 'react';
import { Routes, Route } from 'react-router-dom';
import About from './routes/About';
import Home from './routes/Home';
import Detail from './routes/Detail';
import Navigation from './components/Navigation';

export default class RouterTest extends Component {
    render() {
        return (
            <>
                <Navigation />
                <Routes>
                    <Route path="/" element={<Home />} exact={true} />
                    <Route path="/about" element={<About />} />
                    <Route path="/movie-detail" element={<Detail />} />
                </Routes>
            </>
        );
    }
}
