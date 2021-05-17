package com.subh.dp.player;

public class MediaPlayerDecorator implements MediaPlayer {

    MediaPlayer mediaPlayer;

    public MediaPlayerDecorator(MediaPlayer mediaPlayer){
        this.mediaPlayer=mediaPlayer;
    }

    @Override
    public void assemble() {
        mediaPlayer.assemble();
    }
}
