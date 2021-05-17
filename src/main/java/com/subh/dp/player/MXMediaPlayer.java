package com.subh.dp.player;

public class MXMediaPlayer extends MediaPlayerDecorator {

    public MXMediaPlayer(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("MX Media Player");
    }
}
