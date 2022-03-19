package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] films;
    private int filmsNumber;


    public void addFilm(Movie film) {
        Movie[] collection = new Movie[films.length + 1];
        System.arraycopy(films, 0, collection, 0, films.length);
        collection[collection.length - 1] = film;
        films = collection;
    }

    public MovieManager(int filmsNumber) {
        this.filmsNumber = filmsNumber;
        this.films = new Movie[0];
    }

    public MovieManager() {
        this(10);
    }

    public Movie[] showAll() {
        int resultLength;
        if (films.length > filmsNumber) {
            resultLength = filmsNumber;
        } else {
            resultLength = films.length;
        }
        Movie[] result = new Movie[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public int getFilmQuantity() {
        return films.length;
    }
}
