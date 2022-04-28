import React, { Component } from 'react';

export default class CateringContent extends Component {
    render() {
        return (
            <>
                <header className="display-container text-center position-relative">
                    <img
                        className="img-fluid "
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

                    <hr className="my-5" />

                    <div className="row">
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
                        <div className="col">
                            <img
                                className="rounded img-fluid opacity-75"
                                src="https://www.w3schools.com/w3images/tablesetting.jpg"
                                alt=""
                            />
                        </div>
                    </div>

                    <hr className="my-5" />

                    <div className="row">
                        <h1>Contact</h1>
                        <p>
                            We offer full-service catering for any event, large or small. We
                            understand your needs and we will cater the food to satisfy the biggerst
                            criteria of them all, both look and taste. Do not hesitate to contact
                            us.
                        </p>
                        <h5 className="text-primary">
                            Catering Service, 42nd Living St, 43043 New York, NY
                        </h5>
                        <p>
                            You can also contact us by phone 00553123-2323 or email
                            catering@catering.com, or you can send us a message here:
                        </p>

                        <input type="text" placeholder="Name" className="form-control py-2 my-2" />
                        <input
                            type="number"
                            placeholder="How many people"
                            className="form-control py-2 my-2"
                        />
                        <input type="date" className="form-control py-2 my-2" />
                        <input
                            type="text"
                            placeholder="Message\Special requirements"
                            className="form-control py-2 my-2"
                        />
                        <button type="button" className="btn btn-light hover">
                            Send Message
                        </button>
                    </div>
                </div>
            </>
        );
    }
}
