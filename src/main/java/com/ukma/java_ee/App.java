package com.ukma.java_ee;

import com.ukma.java_ee.players.Boombox;
import com.ukma.java_ee.players.Player;
import com.ukma.java_ee.players.PortableTape;
import com.ukma.java_ee.players.TapeRedorder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        List<Player> players = new ArrayList<Player>();

        players.add((Player) context.getBean("boombox"));
        players.add((Player) context.getBean("tape"));
        players.add((Player) context.getBean("portable_tape"));

        for (Player p: players) p.play();
    }
}
