import React, { Component } from 'react';
import axios from 'axios';
import Movie from '../components/Movie';
import './home.css';

export default class Home extends Component {
    state = {
        isLoading: true,
        movies: [],
    };

    getMovies = async () => {
        try {
            const {
                data: {
                    data: { movies },
                },
            } = await axios.get('https://yts.mx/api/v2/list_movies.json?sort_by=year&limit=5');
            this.setState({ movies, isLoading: false });
        } catch (err) {}
    };
    componentDidMount() {
        this.getMovies();
    }

    render() {
        const { isLoading, movies } = this.state;
        return (
            <section className="container">
                {isLoading ? (
                    <div className="loader">
                        <span className="loader-text">Loading...</span>
                    </div>
                ) : (
                    <div className="movies">
                        {movies.map((movie) => {
                            return (
                                <Movie
                                    key={movie.id}
                                    id={movie.id}
                                    title={movie.title}
                                    poster={movie.medium_cover_image}
                                    summary={movie.summary}
                                    year={movie.year}
                                    genres={movie.genres}
                                />
                            );
                        })}
                    </div>
                )}
            </section>
        );
    }
}
