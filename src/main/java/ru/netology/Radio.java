package ru.netology;

public class Radio {

    private int currentStation = 0;
    private int volume = 0;
    private int stationsNum = 10;

    public void setCurrentStation(int newStationn) {
        if (newStationn >= stationsNum) {
            return;
        }
        if (newStationn < 0) {
            return;
        }
        currentStation = newStationn;
    }

    public void nextStation() {
        if (currentStation == stationsNum - 1) {
            currentStation = 0;
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationsNum - 1;
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume += 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume -= 1;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }

    public Radio() {

    }

    public Radio(int stationsNum) {
        this.stationsNum = stationsNum;
    }
}


