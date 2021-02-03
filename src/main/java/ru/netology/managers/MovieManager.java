package ru.netology.managers;

import ru.netology.domain.MovieItem;


public class MovieManager {
    private int defaultLength = 10; /* Последние 10 добавленных фильмов по умолчанию */
    private int currentLength;      /* Фактическое количество добавленнных фильмов */
    private MovieItem [] items = new MovieItem[0];

    public MovieManager(int defaultLength, int currentLength) {
        this.currentLength = currentLength;
        if (currentLength < defaultLength) {
            defaultLength = currentLength;
        }
        else {
            return;
        }
        this.defaultLength = defaultLength;
    }

    public void add(MovieItem item) {

        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getAll() {
        MovieItem[] result = new MovieItem[defaultLength];

        for (int i = 0; i < result.length; i++) {
            int index = defaultLength - i - 1;
            result[i] = items[index];


        }
        return result;
    }

}
