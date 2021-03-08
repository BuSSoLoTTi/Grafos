package com.grafo.types.NDP;

import com.grafo.structures.Edge;
import com.grafo.structures.Node;

import java.util.ArrayList;
import java.util.List;

public class GrafoNDP<T> {

    private List<Node<T>> node;
    private List<Edge<T>> edge;

    public GrafoNDP() {
        this.node = new ArrayList<Node<T>>();
        this.edge = new ArrayList<Edge<T>>();
    }

    public void addEdge(Double weight,T value1,T value2) {
        Node<T> node1 = getNode(value1);
        Node<T> node2 = getNode(value2);

        Edge<T> firstToSecond = new Edge<>( node1,node2,weight);
        Edge<T> secondToFirst = new Edge<>(node2,node1,weight);

        node1.addEdgeIn(secondToFirst);
        node1.addEdgeOut(firstToSecond);
        node2.addEdgeIn(firstToSecond);
        node2.addEdgeOut(secondToFirst);
    }

    public void addNode(T value) {
        this.node.add(new Node<T>(value));
    }

    public Node<T> getNode(T value) {
        Node<T> node = null;
        for (Node<T> node1 : this.node) {
            if (node1.getValue() == value) {
                node = node1;
            }
        }
        return node;
    }

    public void print(){
        ArrayList<Node<T>> visited = new ArrayList<Node<T>>();
        ArrayList<Node<T>> queue = new ArrayList<Node<T>>();
        Node<T> current = this.node.get(0);
        visited.add(current);
        System.out.println(current.getValue());
        queue.add(current);
        while(queue.size() > 0){
            Node<T> visitado = queue.get(0);
            for(int i=0; i < visitado.getEdgeOut().size(); i++){
                Node<T> next = visitado.getEdgeOut().get(i).getEnd();
                if (!visited.contains(next)){
                    visited.add(next);
                    System.out.println(next.getValue());
                    queue.add(next);
                }
            }
            queue.remove(0);
        }
    }


}
