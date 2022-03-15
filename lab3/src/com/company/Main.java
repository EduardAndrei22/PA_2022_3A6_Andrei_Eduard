package com.company;

import javax.xml.stream.Location;
import java.util.*;
import javax.xml.stream.Location;

public class Main {

    public static void main(String[] args) {
        List<Node> ListForSort = new ArrayList<>();
    Network myNetwork = new Network();
    Node myComputer = new Computer("Computer1");
    myNetwork.addNode(myComputer);
    ListForSort.add(myComputer);
    Node myRouter = new Router("Router1");
    myNetwork.addNode(myRouter);
    ListForSort.add(myRouter);
    Node mySwitch = new Switch("Switch1");
    myNetwork.addNode(mySwitch);
    ListForSort.add(mySwitch);
    Node mySecondSwitch = new Switch("Switch2");
    myNetwork.addNode(mySecondSwitch);
    ListForSort.add(mySecondSwitch);
    Node mySecondRouter = new Router("Router2");
    myNetwork.addNode(mySecondRouter);
    ListForSort.add(mySecondRouter);
    Node mySecondComputer = new Computer("Computer2");
    myNetwork.addNode(mySecondComputer);
    ListForSort.add(mySecondComputer);
    myComputer.setCost(myRouter,10);
    myComputer.setCost(mySwitch,50);
    myRouter.setCost(mySwitch,20);
    myRouter.setCost(mySecondSwitch,20);
    myRouter.setCost(mySecondSwitch,20);
    mySwitch.setCost(mySecondSwitch,10);
    mySecondSwitch.setCost(mySecondRouter,30);
    mySecondSwitch.setCost(mySecondComputer,10);
    mySecondRouter.setCost(mySecondComputer,20);
    System.out.println(myNetwork.toString());
    myNetwork.sortElementIdentifiable(ListForSort);
    System.out.println("lista sortata:" );
    System.out.println(ListForSort);

    }


}
