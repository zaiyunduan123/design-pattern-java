package com.jiang.design.观察者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/29 10:05 PM
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temerature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions:" + temerature
        + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temp, float hunmidity, float pressure) {
        this.temerature = temerature;
        this.humidity = hunmidity;
        display();
    }
}
