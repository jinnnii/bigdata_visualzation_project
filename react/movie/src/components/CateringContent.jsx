import React, { Component } from 'react';

export default class CateringContent extends Component {
    render() {
        return (
            <>
                <header className="display-container position-relative">
                    <img
                        className="img-fluid"
                        width="1600"
                        height="800"
                        src="https://www.w3schools.com/w3images/hamburger.jpg
"
                        alt=""
                    />
                    <div className="position-absolute bottom-0 start-0 opacity-50">
                        <h1>Le Catering</h1>
                    </div>
                </header>
                <div className="container mt-5" Style="max-width:1100px;">
                    <div className="row">
                        <div className="col">
                            <img
                                className="rounded img-fluid opacity-75"
                                src="https://www.w3schools.com/w3images/tablesetting2.jpg"
                                alt=""
                            />
                        </div>
                        <div className="col text-center">
                            <h1>About Catering</h1>
                            <h5 className="py-4">Tradition since 1889</h5>
                            <p>
                                The Catering was founded in blabla by Mr. Smith in lorem ipsum dolor
                                sit amet, consectetur adipiscing elit consectetur adipiscing elit,
                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                                Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
                                nisi ut aliquip ex ea commodo consequat. Duis aute iruredolor in
                                reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
                                pariatur.We only use{' '}
                            </p>
                        </div>
                    </div>

                    <hr />

                    <div className="row">
                        <div className="col">
                            <img
                                className="rounded img-fluid opacity-75"
                                src="https://www.w3schools.com/w3images/tablesetting2.jpg"
                                alt=""
                            />
                        </div>
                        <div className="col text-center">
                            <h1>About Catering</h1>
                            <h5 className="py-4">Tradition since 1889</h5>
                            <p>
                                The Catering was founded in blabla by Mr. Smith in lorem ipsum dolor
                                sit amet, consectetur adipiscing elit consectetur adipiscing elit,
                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                                Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
                                nisi ut aliquip ex ea commodo consequat. Duis aute iruredolor in
                                reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
                                pariatur.We only use{' '}
                            </p>
                        </div>
                    </div>
                </div>
            </>
        );
    }
}
