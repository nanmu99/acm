package com.ppp.observer.improve;

/**
 * @auther ppp
 * @create 2021-07-05 20:31
 */
//观察者接口，有观察者来实现
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
