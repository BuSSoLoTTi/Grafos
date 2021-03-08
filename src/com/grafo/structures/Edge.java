package com.grafo.structures;

/**
 * @author BuSSoLoTTi
 *
 */

public class Edge<T> {

    private Double weight;
    private Node<T> start;
    private Node<T> end;

    public Edge() {
    }

    public Edge(Node<T> start, Node<T> end){
        this.start=start;
        this.end=end;
    }

    public Edge(Node<T> start, Node<T> end,Double weight){
        this.start=start;
        this.end=end;
        this.weight = weight;
    }

    public Node<T> getStart() {
        return start;
    }

    public void setStart(Node<T> start) {
        this.start = start;
    }

    public Node<T> getEnd() {
        return end;
    }

    public void setEnd(Node<T> end) {
        this.end = end;
    }

}
