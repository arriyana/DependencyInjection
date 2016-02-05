package com.ukma.java_ee.players;

import com.ukma.java_ee.records.Cassette;

/**
 * Created by user on 05.02.2016.
 */
public class TapeRedorder implements Player {

    protected Cassette cassette;

    public TapeRedorder() {
    }

    public TapeRedorder(Cassette cassette) {
        this.cassette = cassette;
    }

    public Cassette getCassette() {
        return cassette;
    }

    public void setCassette(Cassette cassette) {
        this.cassette = cassette;
    }

    public void play() {
        System.out.println(cassette.getRecord());
    }
}
