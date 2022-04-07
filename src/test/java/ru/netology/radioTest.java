package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    private Radio radio = new Radio(20);

    /*@ParameterizedTest
    @CsvSource(value = {"station is -1,-1,0", "station is 0,0,0", "station is 1,1,1", "station is 8,8,8", "station is 9,9,9", "station is 10,10,0"})
    public void setStationTest(String testName, int stationNum, int expected) {

        radio.setCurrentStation(stationNum);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }*/

    @ParameterizedTest
    @CsvSource(value = {"station is 0,0,1", "station is 1,1,2", "station is 18,18,19", "station is 19,19,0"})
    public void nextStationTest(String testName, int currentStation, int expected) {
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"station is 0,0,19", "station is 1,1,0", "station is 18,18,17", "station is 19,19,18"})
    public void prevStationTest(String testName, int currentStation, int expected) {
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    /*@ParameterizedTest
    @CsvSource(value = {"volume is -1,-1,0", "volume is 0,0,0", "volume is 1,1,1", "volume is 9,9,9", "volume is 10,10,10", "volume is 11,11,0"})
    public void setVolumeTest(String testName, int volume, int expected) {
        radio.setVolume(volume);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }*/

    @ParameterizedTest
    @CsvSource(value = {"volume is 0,0,1", "volume is 1,1,2", "volume is 99,99,100", "volume is 100,100,100"})
    public void increaseVolumeTest(String testName, int volume, int expected) {
        radio.setVolume(volume);
        radio.increaseVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"volume is 0,0,0", "volume is 1,1,0", "volume is 99,99,98", "volume is 100,100,99"})
    public void decreaseVolumeTest(String testName, int volume, int expected) {
        radio.setVolume(volume);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }
}