package com.jiang.design.观察者模式.jdk;

import com.jiang.design.观察者模式.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/29 10:17 PM
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
   Observable observable;
    private float temerature;
    private float humidity;


    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData= (WeatherData) o;
            this.temerature = weatherData.getTemerature();
            this.humidity= weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions:" + temerature
                + "F degrees and " + humidity + "% humidity");
    }

}
