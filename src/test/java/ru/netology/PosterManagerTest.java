package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void shouldAddNewFilms() {
        PosterManager manager = new PosterManager();

        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        manager.addNewFilm("Film IV");
        manager.addNewFilm("Film V");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        PosterManager manager = new PosterManager(4);
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        manager.addNewFilm("Film IV");
        manager.addNewFilm("Film V");
        manager.addNewFilm("Film VI");
        manager.addNewFilm("Film VII");
        manager.addNewFilm("Film VIII");
        manager.addNewFilm("Film IX");
        manager.addNewFilm("Film X");
        manager.addNewFilm("Film XI");
        manager.addNewFilm("Film XII");
        manager.addNewFilm("Film XIII");
        manager.addNewFilm("Film XIV");

        String[] expected = {"Film XIV", "Film XIII", "Film XII", "Film XI"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast2() {
        PosterManager manager = new PosterManager();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        manager.addNewFilm("Film IV");
        manager.addNewFilm("Film V");
        manager.addNewFilm("Film VI");
        manager.addNewFilm("Film VII");
        manager.addNewFilm("Film VIII");
        manager.addNewFilm("Film IX");
        manager.addNewFilm("Film X");
        manager.addNewFilm("Film XI");
        manager.addNewFilm("Film XII");
        manager.addNewFilm("Film XIII");
        manager.addNewFilm("Film XIV");

        String[] expected = {"Film XIV", "Film XIII", "Film XII", "Film XI", "Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast3() {
        PosterManager manager = new PosterManager();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");



        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
