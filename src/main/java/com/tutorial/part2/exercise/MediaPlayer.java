package com.tutorial.part2.exercise;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

@StateSet({"stopped", "playing", "paused"})
public class MediaPlayer {

    @StateRefinement(to="stopped(this)")
    public MediaPlayer() {}

    @StateRefinement(from="true", to="true")
    public void play() {}

    @StateRefinement(from="true", to="true")
    public void pause() {}

    @StateRefinement(from="true", to="true")
    public void resume() {}

    @StateRefinement(from="true", to="true")
    public void stop() {}

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.play();
        player.pause();
        player.resume();
        player.stop();
        player.resume(); // should be an error
    }
}