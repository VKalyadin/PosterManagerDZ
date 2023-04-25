package ru.netology;

public class PosterManager {
    private String[] poster = new String[0];
    private int maxLimit;

    public PosterManager() {
        this.maxLimit = 10;
    }

    public PosterManager(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public void addNewFilm(String posters) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = posters;
        poster = tmp;

    }

    public String[] findAll() {
        return poster;
    }

    public String[] findLast() {
        int resultLength;
        if (poster.length < maxLimit) {
            resultLength = poster.length;
        } else {
            resultLength = maxLimit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = poster[poster.length - 1 - i];
        }
        return tmp;
    }
}
