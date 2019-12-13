package com.mygdx.game;

public class Snake {
    Block head;
    Block[] body;

    public Snake(){
        head = new Block(0, 0);
        body = new Block[50];
        for(int i = 0; i < 50; i++){
            body[i] = new Block(-500, 0);
        }
    }
}
