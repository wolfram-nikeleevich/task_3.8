package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    private Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource(value = {"station is -1,-1,0", "station is 0,0,0", "station is 1,1,1", "station is 8,8,8", "station is 9,9,9", "station is 10,10,0"})
    public void setStationTest(String testName, int stationNum, int expected) {

        radio.setStationNum(stationNum);
        int actual = radio.getStationNum();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"station is 0,0,1", "station is 1,1,2", "station is 8,8,9", "station is 9,9,0"})
    public void nextStationTest(String testName, int stationNum, int expected) {
        radio.setStationNum(stationNum);
        radio.nextStation();
        int actual = radio.getStationNum();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"station is 0,0,9", "station is 1,1,0", "station is 8,8,7", "station is 9,9,8"})
    public void prevStationTest(String testName, int stationNum, int expected) {
        radio.setStationNum(stationNum);
        radio.prevStation();
        int actual = radio.getStationNum();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"volume is -1,-1,0", "volume is 0,0,0", "volume is 1,1,1", "volume is 9,9,9", "volume is 10,10,10", "volume is 11,11,0"})
    public void setVolumeTest(String testName, int volume, int expected) {
        radio.setVolume(volume);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"volume is 0,0,1", "volume is 1,1,2", "volume is 9,9,10", "volume is 10,10,10"})
    public void increaseVolumeTest(String testName, int volume, int expected) {
        radio.setVolume(volume);
        radio.increaseVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"volume is 0,0,0", "volume is 1,1,0", "volume is 9,9,8", "volume is 10,10,9"})
    public void decreaseVolumeTest(String testName, int volume, int expected) {
        radio.setVolume(volume);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }
}