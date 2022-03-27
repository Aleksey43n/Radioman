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
    public void shouldSetNextChanel1() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);
        radio.setNextChanel();
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.setNextChanel();
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChanel1() {
        Radio radio = new Radio();
        radio.setCurrentChanel(1);
        radio.setPrevChanel();
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.setPrevChanel();
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setReduceVolume();
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setReduceVolume();
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setIncreaseVolume();
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setIncreaseVolume();
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}
