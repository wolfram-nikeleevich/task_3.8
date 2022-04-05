package ru.netology;

public class Radio {

    private int stationNum = 0;
    private int volume = 0;

    public void setStationNum(int newStationn) {
        if (newStationn > 9) {
            return;
        }
        if (newStationn < 0) {
            return;
        }
        stationNum = newStationn;
    }

    public void nextStation() {
        if (stationNum == 9) {
            stationNum = 0;
        } else {
            setStationNum(stationNum + 1);
        }
    }

    public void prevStation() {
        if (stationNum == 0) {
            stationNum = 9;
        } else {
            setStationNum(stationNum - 1);
        }
    }

    public int getStationNum() {
        return stationNum;
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
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
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }
}
