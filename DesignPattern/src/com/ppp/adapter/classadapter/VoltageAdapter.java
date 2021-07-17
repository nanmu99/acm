package com.ppp.adapter.classadapter;

/**
 * @auther ppp
 * @create 2021-06-30 18:54
 */
//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        int dstv = srcV/44;//转成 5v
        return dstv;
    }
}
