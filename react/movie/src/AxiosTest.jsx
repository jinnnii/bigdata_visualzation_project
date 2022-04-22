import React, { Component } from 'react';
import axios from 'axios';
import Movie from './components/Movie';

export default class AxiosTest extends Component {
    state = {
        isLoading: true,
        movies: [],
    };

    /**
     * axync : 비동기 방식임을 알려줌
     * await : 비동기 로직이 끝날 때 까지 기다림
     *
     * !비동기 로직을 처리하기 위한 최신 방법
     * ES2017 버전에 추가된 새로운 비동기 로직 처리 방식
     * async 키워드 사용 시, 해당 함수 내에서 비동기 처리가 필요한 메서드가 있음을 알려줌!
     * await 키워드 사용 시, 해당 메서드의 비동기 처리가 완료될 때까지 로직을 실행하지 않고
     * 사용법
     * async function 함수명(){
     *      await 비동기 처리 메소드명();
     * }
     */

    //*수업 코드
    getMovies2 = async () => {
        try {
            const {
                data: {
                    data: { movies },
                },
            } = await axios.get('https://yts.mx/api/v2/list_movies.json?sort_by=year&limit=5');
            this.setState({ movies, isLoading: false });
        } catch (err) {}
    };

    //!내 코드
    getMovies = () => {
        axios
            .get('https://yts.mx/api/v2/list_movies.json')
            .then((resp) => {
                const movies = resp.data.data.movies.map((movie) => {
                    return movie;
                });
                this.setState({ movies, isLoading: false });
            })
            .catch(() => {});
    };

    componentDidMount() {
        this.getMovies2();
    }

    render() {
        const { isLoading, movies } = this.state;
        return (
            <section>
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
