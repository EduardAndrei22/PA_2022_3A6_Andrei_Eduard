package com.company;

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
    System.out.println(myNetwork.toString());

    }


}
