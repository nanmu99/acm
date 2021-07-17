package com.ppp.builder.improve;

/**
 * @auther ppp
 * @create 2021-06-30 18:33
 */
public class CommonHouse extends  HouseBuilder{
    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子打地基5米 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子砌墙10cm ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子屋顶 ");
    }

}
