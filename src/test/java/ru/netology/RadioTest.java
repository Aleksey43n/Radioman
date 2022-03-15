package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(-1);
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelOverMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(10);
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        int expected = radio.getMaxChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextChanel() {
        Radio radio = new Radio();
        radio.setNextChanel(9);
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChanel() {
        Radio radio = new Radio();
        radio.setPrevChanel(0);
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolume() {
        Radio radio = new Radio();
        radio.setReduceVolume(1);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(9);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}