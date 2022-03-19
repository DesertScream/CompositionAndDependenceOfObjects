package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] films;
    private int filmsNumber;

    //------- метод для добавления элементов в массив из любого места программы------

    public void addFilm(Movie film) {
        Movie[] collection = new Movie[films.length + 1];
        System.arraycopy(films, 0, collection, 0, films.length);
        collection[collection.length - 1] = film;
        films = collection;
    }

    //------------- конструктор с задаваемым параметром------
    public MovieManager(int filmsNumber) {
        this.filmsNumber = filmsNumber;
        this.films = new Movie[0];
    }

    // ---------конструктор без параметра, он вызывает конструктор с параметром по умолчанию-------
    public MovieManager() {
        this(10);
    }
    //  ------------------создание массива и заполнение ячеек и передаю менеджеру в массив новые фильмы----------------

//        Manager manager = new Manager(10);
//        manager.addFilm(new Movie(1, "Один дома", "jpg", "comedy", true));
//        manager.addFilm(new Movie(2, "Драйв", "jpg", "action", true));
//        manager.addFilm(new Movie(3, "Достучаться до небес", "jpg", "drama", true));
//        manager.addFilm(new Movie(4, "Отель", "jpg", "comedy", false));
//        manager.addFilm(new Movie(5, "Битва за Москву", "jpg", "military drama", true));
//        manager.addFilm(new Movie(6, "В августе 44-го", "jpg", "military drama", false));
//        manager.addFilm(new Afisha(7, "Интерстеллар", "jpg", "action", true));
//        manager.addFilm(new Afisha(8, "Матрица", "jpg", "action", true));
//        manager.addFilm(new Afisha(9, "Безумный Макс", "jpg", " action ", true));
//        manager.addFilm(new Afisha(10, "Поезд на Юму", "jpg", "western", false));
//
//
//// ------------добавление в массив элемента с помощью создания нового массива-------------
//        Afisha afisha = new Afisha(11, "2012", "jpg", "fantastic", false);
//        manager.addFilm(afisha);
//
//    }

    // --------- Выводим все фильмы в обратном порядке---------------------------
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

    //--------------- Выводим любой фильм по индексу из массива---------------
//    public Afisha getAfisha(int index) {
//        Afisha result = null;
//        if (index >= 0 && index < films.length) {
//            result = films[index];
//        }
//        return result;
//    }
//
//    public int getFilmsNumber() {
//        return filmsNumber;
//    }

}
