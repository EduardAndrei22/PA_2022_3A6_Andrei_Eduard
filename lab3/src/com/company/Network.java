package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Network  {
    private List<Node> nodes = new ArrayList<>();




    public Network() {
        this.nodes = nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +

                '}';
    }
public void sortElementIdentifiable(List<Node> nodes){
    List<Node> listForSort = new ArrayList<>();
    for (int i = 0; i < nodes.size() - 1; i++)
    {
        boolean b = nodes.get(i) instanceof Identifiable;
        if(b)
            listForSort.add(nodes.get(i));
    }
    List<Node> newSortedList = listForSort.stream()
            .sorted(Comparator.comparing(Node::getName))
            .collect(Collectors.toList());
    nodes.removeAll(nodes);
    nodes.addAll( newSortedList );

}
}
