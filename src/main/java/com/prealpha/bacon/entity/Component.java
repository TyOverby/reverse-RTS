package com.prealpha.bacon.entity;

/**
 * User: Ty
 * Date: 8/3/12
 * Time: 2:09 PM
 */
public abstract class Component {
    abstract void update(int delta);

    private final GameObject parent;

    public Component(GameObject parent){
        this.parent = parent;
    }
}
