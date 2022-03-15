package com.company;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Network myNetwork = new Network();
    Node myComputer = new Computer("Computer1");
    myNetwork.addNode(myComputer);
    Node myRouter = new Router("Router1");
    myNetwork.addNode(myRouter);
    Node mySwitch = new Switch("Switch1");
    myNetwork.addNode(mySwitch);
    Node mySecondSwitch = new Switch("Switch2");
    myNetwork.addNode(mySecondSwitch);
    Node mySecondRouter = new Router("Router2");
    myNetwork.addNode(mySecondRouter);
    Node mySecondComputer = new Computer("Computer2");
    myNetwork.addNode(mySecondComputer);
    Node myfirstconnection = new Node("Computer1 to Router1", 10) {
        @Override
        public int compareTo(Location o) {
            return 0;
        }
    };
    myNetwork.addNode(myfirstconnection);
    System.out.println(myNetwork.toString());

    }


}
