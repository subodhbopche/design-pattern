package com.subh.dp.player;

public class TestPlayer {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new NormalMediaPlayer();
        mediaPlayer.assemble();

        MediaPlayer mediaPlayer1 = new MXMediaPlayer(new NormalMediaPlayer());
        mediaPlayer1.assemble();
    }
}
