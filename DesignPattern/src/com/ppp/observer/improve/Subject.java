package com.ppp.observer.improve;



/**
 * @auther ppp
 * @create 2021-07-05 20:30
 */

//接口, 让WeatherData 来实现
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
