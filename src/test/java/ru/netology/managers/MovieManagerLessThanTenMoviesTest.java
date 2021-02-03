package ru.netology.managers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;


import static org.junit.jupiter.api.Assertions.*;

class MovieManagerLessThanTenMoviesTest {

    MovieManager manager = new MovieManager(10, 6);
    MovieItem first = new MovieItem(1, 1, "first", "comedy");
    MovieItem second = new MovieItem(2, 2, "second", "thriller");
    MovieItem third = new MovieItem(3, 3, "third", "drama");
    MovieItem fourth = new MovieItem(4, 4, "fourth", "horror");
    MovieItem fifth = new MovieItem(5, 5, "fifth", "love story");
    MovieItem sixth = new MovieItem(6, 6, "sixth", "drama");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
    }

    @Test
    void shouldLessTenMovies() {
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

}