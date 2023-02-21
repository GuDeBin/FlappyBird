package com.gdb.flappybird.component;

import java.awt.*;

/**
 * 小鸟类，实现小鸟的绘制与飞行逻辑
 */
public class Bird {
    public static final int IMG_COUNT = 8;
    public static final int STATE_COUNT = 4;
    private final Rectangle birdCollisionRect;
    private int x;

    public Bird(Rectangle birdCollisionRect) {
        this.birdCollisionRect = birdCollisionRect;
    }

//    public long getBestScore(){
//        return counter.getBestScore();
//    }

    public int getBirdX(){
        return x;
    }

    // 获取小鸟的碰撞矩形
    public Rectangle getBirdCollisionRect(){
        return birdCollisionRect;
    }
}
