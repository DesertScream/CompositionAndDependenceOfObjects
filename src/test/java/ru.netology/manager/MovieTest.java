package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieTest {

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
    public void shouldFindLastOver() {
        MovieManager manager = new MovieManager(9);
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


        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Movie[] actual = manager.showAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver1() {
        MovieManager manager = new MovieManager(11);
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


        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Movie[] actual = manager.showAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver2() {
        MovieManager manager = new MovieManager(12);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);

        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};
        Movie[] actual = manager.showAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver3() {
        MovieManager manager = new MovieManager(9);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);

        Movie[] expected = new Movie[]{seventh, sixth, fifth, fourth, third, second, first};
        Movie[] actual = manager.showAll();

        assertArrayEquals(expected, actual);

    }

}