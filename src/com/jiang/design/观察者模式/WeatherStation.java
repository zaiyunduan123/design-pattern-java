package com.jiang.design.观察者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/29 10:10 PM
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
