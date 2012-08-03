package com.prealpha.bacon.entity;

import org.lwjgl.util.vector.Vector2f;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Ty
 * Date: 8/3/12
 * Time: 2:09 PM
 */
public class GameObject {
    private List<Component> components = new ArrayList<Component>(30);

    private Vector2f position = new Vector2f(0,0);
    private float rotation = 0f;
}
