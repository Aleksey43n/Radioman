package ru.netology;

public class Radio {

    private int minChanel = 0;
    private int maxChanel = 9;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;
    private int currentChanel;

    public int getCurrentChanel() {

        return currentChanel;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMinChanel() {

        return minChanel;
    }

    public int getMaxChanel() {

        return maxChanel;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel < minChanel) {
            return;
        }
        if (currentChanel > maxChanel) {
            return;
        }
        this.currentChanel = currentChanel;

    }

    public void setNextChanel() {
        if (currentChanel < maxChanel) {
            currentChanel = currentChanel + 1;
        }
    }

    public void setPrevChanel() {
        if (currentChanel > minChanel) {
            currentChanel = currentChanel - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setReduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }
}

