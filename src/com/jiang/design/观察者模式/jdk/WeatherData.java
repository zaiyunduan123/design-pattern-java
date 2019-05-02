package com.jiang.design.观察者模式.jdk;

import java.util.Observable;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/29 10:14 PM
 */
public class WeatherData extends Observable {
    private float temerature;
    private float humidity;
    private float pressure;

    public  WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temerature, float humidity, float pressure){
        this.temerature = temerature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getTemerature() {
        return temerature;
    }

    public void setTemerature(float temerature) {
        this.temerature = temerature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
