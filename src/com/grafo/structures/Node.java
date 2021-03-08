package com.grafo.structures;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BuSSoLoTTi
 *
 */

public class Node <T>{

    private T value;
    private List<Edge<T>>edgeIn;
    private List<Edge<T>>edgeOut;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
        this.edgeIn = new ArrayList<Edge<T>>();
        this.edgeOut = new ArrayList<Edge<T>>();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void addEdgeIn(Edge edge){
        this.edgeIn.add(edge);
    }

    public void addEdgeOut(Edge edge){
        this.edgeOut.add(edge);
    }

    public List<Edge<T>> getEdgeIn() {
        return edgeIn;
    }

    public List<Edge<T>> getEdgeOut() {
        return edgeOut;
    }
}
