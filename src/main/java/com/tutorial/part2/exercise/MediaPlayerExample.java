package com.tutorial.part2.exercise;;

public class MediaPlayerExample {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.play();
        player.pause();
        player.resume();
        player.stop();
        player.resume(); // should be an error
    }
}
