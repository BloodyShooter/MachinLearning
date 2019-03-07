package org.gvozdetscky;

import org.junit.Test;

import static org.junit.Assert.*;

public class NetworkTest {

    @Test
    public void testWithVodkaAndFriendWithoutRain() {
        int vodka = 1;
        int rain = 0;
        int friend = 1;

        System.out.println(
                "Водка: " + (vodka == 1 ? "Есть" : "Нет") +
                " Дождь: " + (rain == 1 ? "Есть" : "Нет") +
                " Друзья: " + (friend == 1 ? "Есть" : "Нет"));

        boolean predict = new Network().predict(vodka, rain, friend);

        System.out.println("Result: " + predict);

        assertTrue(predict);
    }

    @Test
    public void testWithVodkaAndRainWithoutFriend() {
        int vodka = 1;
        int rain = 1;
        int friend = 0;

        System.out.println(
                "Водка: " + (vodka == 1 ? "Есть" : "Нет") +
                        " Дождь: " + (rain == 1 ? "Есть" : "Нет") +
                        " Друзья: " + (friend == 1 ? "Есть" : "Нет"));

        System.out.println("Result: " + new Network().predict(vodka, rain, friend));

        boolean predict = new Network().predict(vodka, rain, friend);

        System.out.println("Result: " + predict);

        assertFalse(predict);
    }

    @Test
    public void testWithRainAndFriendWithoutVodka() {
        int vodka = 0;
        int rain = 1;
        int friend = 1;

        System.out.println(
                "Водка: " + (vodka == 1 ? "Есть" : "Нет") +
                        " Дождь: " + (rain == 1 ? "Есть" : "Нет") +
                        " Друзья: " + (friend == 1 ? "Есть" : "Нет"));

        System.out.println("Result: " + new Network().predict(vodka, rain, friend));

        boolean predict = new Network().predict(vodka, rain, friend);

        System.out.println("Result: " + predict);

        assertTrue(predict);
    }

    @Test
    public void testFriendWithoutVodkaAndRain() {
        int vodka = 0;
        int rain = 0;
        int friend = 1;

        System.out.println(
                "Водка: " + (vodka == 1 ? "Есть" : "Нет") +
                        " Дождь: " + (rain == 1 ? "Есть" : "Нет") +
                        " Друзья: " + (friend == 1 ? "Есть" : "Нет"));

        System.out.println("Result: " + new Network().predict(vodka, rain, friend));

        boolean predict = new Network().predict(vodka, rain, friend);

        System.out.println("Result: " + predict);

        assertTrue(predict);
    }

    @Test
    public void testWithVodkaWithoutFriendAndRain() {
        int vodka = 1;
        int rain = 0;
        int friend = 0;

        System.out.println(
                "Водка: " + (vodka == 1 ? "Есть" : "Нет") +
                        " Дождь: " + (rain == 1 ? "Есть" : "Нет") +
                        " Друзья: " + (friend == 1 ? "Есть" : "Нет"));

        System.out.println("Result: " + new Network().predict(vodka, rain, friend));

        boolean predict = new Network().predict(vodka, rain, friend);

        System.out.println("Result: " + predict);

        assertTrue(predict);
    }

    @Test
    public void testWithRainWithoutVodkaAndFriend() {
        int vodka = 0;
        int rain = 1;
        int friend = 0;

        System.out.println(
                "Водка: " + (vodka == 1 ? "Есть" : "Нет") +
                        " Дождь: " + (rain == 1 ? "Есть" : "Нет") +
                        " Друзья: " + (friend == 1 ? "Есть" : "Нет"));

        System.out.println("Result: " + new Network().predict(vodka, rain, friend));

        boolean predict = new Network().predict(vodka, rain, friend);

        System.out.println("Result: " + predict);

        assertFalse(predict);
    }

    @Test
    public void testWithoutVodkaAndRainAndFriend() {
        int vodka = 0;
        int rain = 0;
        int friend = 0;

        System.out.println(
                "Водка: " + (vodka == 1 ? "Есть" : "Нет") +
                        " Дождь: " + (rain == 1 ? "Есть" : "Нет") +
                        " Друзья: " + (friend == 1 ? "Есть" : "Нет"));

        System.out.println("Result: " + new Network().predict(vodka, rain, friend));

        boolean predict = new Network().predict(vodka, rain, friend);

        System.out.println("Result: " + predict);

        assertFalse(predict);
    }

    @Test
    public void testWithVodkaAndRainAndFriend() {
        int vodka = 1;
        int rain = 1;
        int friend = 1;

        System.out.println(
                "Водка: " + (vodka == 1 ? "Есть" : "Нет") +
                        " Дождь: " + (rain == 1 ? "Есть" : "Нет") +
                        " Друзья: " + (friend == 1 ? "Есть" : "Нет"));

        System.out.println("Result: " + new Network().predict(vodka, rain, friend));

        boolean predict = new Network().predict(vodka, rain, friend);

        System.out.println("Result: " + predict);

        assertFalse(predict);
    }

}