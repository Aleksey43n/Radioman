package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
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
      public void shouldSetNextChanel () {
          Radio radio = new Radio();
          radio.setNextChanel( );
         int expected = radio.getCurrentChanel();
         int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
}

    @Test
      public void shouldSetPrevChanel () {
           Radio radio = new Radio();
          radio.setPrevChanel();
          int expected = radio.getCurrentChanel();
          int actual = radio.getCurrentChanel();
          assertEquals(expected, actual);
       }

    @Test
    public void shouldSetCurrentVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolume () {
        Radio radio = new Radio();
        radio.setReduceVolume(5);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume () {
        Radio radio = new Radio();
        radio.setIncreaseVolume();
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}