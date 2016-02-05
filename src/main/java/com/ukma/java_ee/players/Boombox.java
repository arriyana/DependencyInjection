package com.ukma.java_ee.players;

import com.ukma.java_ee.records.Cassette;

import java.util.List;

/**
 * Created by user on 05.02.2016.
 */
public class Boombox implements Player{

    private List<Cassette> cassettes;

    public Boombox() {
    }

    public Boombox(List<Cassette> cassettes) {
        this.cassettes = cassettes;
    }

    public List<Cassette> getCassettes() {
        return cassettes;
    }

    public void addCassette(Cassette cassette) {
        this.cassettes.add(cassette);
    }

    public void setCassette(List<Cassette> cassettes) {
        this.cassettes = cassettes;
    }

    public void play() {
        for(Cassette cassette:cassettes)
            System.out.println(cassette.getRecord().toUpperCase());
    }

}
