package ru.netology.manager;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    private MovieManager manager = new MovieManager();

    private Movie first = new Movie(1, "Один дома", "jpg", "comedy", true);
    private Movie second = new Movie(2, "Драйв", "jpg", "action", true);
    private Movie third = new Movie(3, "Достучаться до небес", "jpg", "drama", true);
    private Movie fourth = new Movie(4, "Отель", "jpg", "comedy", false);
    private Movie fifth = new Movie(5, "Битва за Москву", "jpg", "military drama", true);
    private Movie sixth = new Movie(6, "В августе 44-го", "jpg", "military drama", false);
    private Movie seventh = new Movie(7, "Интерстеллар", "jpg", "action", true);
    private Movie eighth = new Movie(8, "Матрица", "jpg", "action", true);
    private Movie ninth = new Movie(9, "Безумный Макс", "jpg", " action ", true);
    private Movie tenth = new Movie(10, "Поезд на Юму", "jpg", "western", false);

    @BeforeEach
    void setUp() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
    }

    @Test
    void shouldAddAnyNumberOfMovies() {
        manager.addFilm(new Movie(11, "2012", "jpg", "fantastic", false));
        int expected = 11;
        int actual = manager.getFilmQuantity();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAllArray() {
        int expected = 10;
        Movie[] actual = manager.showAll();

        assertEquals(expected, actual.length);
    }
}