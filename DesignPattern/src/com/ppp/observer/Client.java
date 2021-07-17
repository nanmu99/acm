package com.ppp.observer;

/**
 * @auther ppp
 * @create 2021-07-05 20:26
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方 currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        //创建 WeatherData 并将 接入方 currentConditions 传递到 WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);
        //更新天气情况
        weatherData.setData(30,150,40);
        //天气情况变化
        System.out.println("============天气情况变化=============");
        weatherData.setData(40, 160, 20);
    }
}