package ru.netology.managers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;


import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    MovieManager manager = new MovieManager(10, 10);
    MovieItem first = new MovieItem(1, 1, "first", "comedy");
    MovieItem second = new MovieItem(2, 2, "second", "thriller");
    MovieItem third = new MovieItem(3, 3, "third", "drama");
    MovieItem fourth = new MovieItem(4, 4, "fourth", "horror");
    MovieItem fifth = new MovieItem(5, 5, "fifth", "love story");
    MovieItem sixth = new MovieItem(6, 6, "sixth", "drama");
    MovieItem seventh = new MovieItem(7, 7, "seventh", "horror");
    MovieItem eighth = new MovieItem(8, 8, "eighth", "comedy");
    MovieItem ninth = new MovieItem(9, 9, "ninth", "love story");
    MovieItem tenth = new MovieItem(10, 10, "tenth", "horror");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    void shouldTenMovies() {
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

}

