package com.gdb.flappybird.util;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 音乐工具类
 */
public class MusicUtil {
    private static AudioStream fly;
    private static AudioStream crash;
    private static AudioStream score;


    public static void playScore(){
        try {
            InputStream scoreIn = new FileInputStream("resources/wav/score.wav");
            score = new AudioStream(scoreIn);
        }catch (IOException ignored){

        }
        AudioPlayer.player.start(score);
    }
}
