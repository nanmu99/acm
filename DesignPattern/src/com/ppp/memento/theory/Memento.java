package com.ppp.memento.theory;

/**
 * @auther ppp
 * @create 2021-07-05 21:18
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
