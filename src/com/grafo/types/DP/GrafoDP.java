package com.grafo.types.DP;

import com.grafo.structures.Edge;
import com.grafo.structures.Node;

import java.util.ArrayList;
import java.util.List;

public class GrafoDP<T> {

    private List<Node<T>> node;
    private List<Edge<T>> edge;

    public GrafoDP() {
        this.node = new ArrayList<Node<T>>();
        this.edge = new ArrayList<Edge<T>>();
    }

    public void addEdge(Double weight, T first, T second) {
        Node<T> node1 = getNode(first);
        Node<T> node2 = getNode(second);

        node1.addEdgeOut(new Edge<>(node1, node2, weight));
        node2.addEdgeIn(new Edge<>(node1, node2, weight));

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

    public void print() {
        ArrayList<Node<T>> visited = new ArrayList<Node<T>>();
        ArrayList<Node<T>> queue = new ArrayList<Node<T>>();
        Node<T> current = this.node.get(0);
        visited.add(current);
        System.out.println(current.getValue());
        queue.add(current);
        while (queue.size() > 0) {
            Node<T> visitado = queue.get(0);
            for (int i = 0; i < visitado.getEdgeOut().size(); i++) {
                Node<T> next = visitado.getEdgeOut().get(i).getEnd();
                if (!visited.contains(next)) { //se o vértice ainda não foi marcado
                    visited.add(next);
                    System.out.println(next.getValue());
                    queue.add(next);
                }
            }
            queue.remove(0);
        }
    }
}
