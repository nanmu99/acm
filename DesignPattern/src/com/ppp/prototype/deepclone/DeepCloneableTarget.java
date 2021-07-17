package com.ppp.prototype.deepclone;

import java.io.Serializable;

/**
 * @auther ppp
 * @create 2021-06-30 18:08
 */
public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
