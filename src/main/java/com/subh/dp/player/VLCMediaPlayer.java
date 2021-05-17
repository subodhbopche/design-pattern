package com.subh.dp.player;

public class VLCMediaPlayer extends MediaPlayerDecorator {

    public VLCMediaPlayer(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("VLC Media Player");
    }
}
