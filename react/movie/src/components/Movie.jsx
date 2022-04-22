import React, { Component } from 'react';
import PropTypes from 'prop-types';
import { Link } from 'react-router-dom';
import './movie.css';

export default class Movie extends Component {
    render() {
        const { id, year, title, summary, poster, genres } = this.props;
        return (
            <div className="movie">
                <Link
                    to={{
                        pathname: '/movie-detail',
                        state: { year, title, summary, poster, genres },
                    }}
                >
                    <img className="movie-poster" src={poster} alt={title} title={title} />
                    <p>{id}</p>
                    <div className="movie-data">
                        <h3 className="movie-title">{title}</h3>
                        <p className="movie-year">{year}</p>
                        <ul className="movie-genres">
                            {genres.map((genre, index) => {
                                return (
                                    <li key={index} className="movie-genre">
                                        {genre}
                                    </li>
                                );
                            })}
                        </ul>
                        <p className="movie-summary">{summary.slice(0, 180)}</p>
                    </div>
                </Link>
            </div>
        );
    }
}

Movie.propTypes = {
    id: PropTypes.number.isRequired,
    year: PropTypes.number.isRequired,
    title: PropTypes.string.isRequired,
    summary: PropTypes.string.isRequired,
    poster: PropTypes.string.isRequired,
    genres: PropTypes.arrayOf(PropTypes.string).isRequired,
};
