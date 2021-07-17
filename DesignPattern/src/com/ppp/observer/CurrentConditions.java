package com.ppp.observer;

/**
 * 显示当前天气情况（可以理解成是气象站自己的网站）
 * @auther ppp
 * @create 2021-07-05 20:22
 */
public class CurrentConditions {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }

    public void display(){
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
