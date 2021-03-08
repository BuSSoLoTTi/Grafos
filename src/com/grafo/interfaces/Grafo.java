package com.grafo.interfaces;



import com.grafo.structures.Node;
/**
 * not finished
 * @author BuSSoLoTTi
 */

public interface Grafo<T>  {

    void addNode(Node node);

    Node getNode(T value);

}
