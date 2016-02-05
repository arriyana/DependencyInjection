package com.ukma.java_ee.players;

import com.ukma.java_ee.records.Cassette;

/**
 * Created by user on 05.02.2016.
 */
public class PortableTape extends TapeRedorder{

    public PortableTape(Cassette cassette) {
        super(cassette);
    }

    @Override
    public void play() {
        System.out.println(cassette.getRecord().toLowerCase());
    }
}
