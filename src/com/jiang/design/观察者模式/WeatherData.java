package com.jiang.design.观察者模式;

import java.util.ArrayList;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/29 9:57 PM
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temerature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }


    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        for (int i =0;i< observers.size();i++){
            Observer o = (Observer) observers.get(i);
            o.update(temerature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temerature, float humidity, float pressure){
        this.temerature = temerature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

}
