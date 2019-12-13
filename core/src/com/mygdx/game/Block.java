package com.mygdx.game;

import com.badlogic.gdx.math.Rectangle;

public class Block {
    public Rectangle hitbox;

    public Block(float x, float y){
        hitbox = new Rectangle(x, y, 150, 150);
    }
}
