package com.ppp.observer;

/**
 *  类是核心
 *  * 1. 包含最新的天气情况信息
 *  * 2. 含有 CurrentConditions 对象
 *  * 3. 当数据有更新时，就主动的调用   CurrentConditions对象update方法(含 display), 这样他们（接入方）就看到最新的信息
 * @auther ppp
 * @create 2021-07-05 20:21
 */



public class WeatherData {
    private float temperatrue;
    private float pressure;
    private float humidity;

    //加入新的第三方
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }


    public void dataChange(){
        //调用 接入方的 update
        currentConditions.update(getTemperatrue(),getPressure(),getHumidity());
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperatrue,float pressure,float humidity){
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }




}
