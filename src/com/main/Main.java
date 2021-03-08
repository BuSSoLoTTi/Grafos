package com.main;

import com.grafo.interfaces.Grafo;
import com.grafo.types.DNP.GrafoDNP;
import com.grafo.types.DP.GrafoDP;
import com.grafo.types.NDNP.GrafoNDNP;
import com.grafo.types.NDP.GrafoNDP;

public class Main {

    public static void main(String[] args) {

        GrafoDP<Integer> grafoNDNP = new GrafoDP<>();


        grafoNDNP.addNode(1);
        grafoNDNP.addNode(2);
        grafoNDNP.addNode(3);
        grafoNDNP.addNode(4);
        grafoNDNP.addNode(5);


        grafoNDNP.addEdge(2.0,1,2);
        grafoNDNP.addEdge(1.0,1,5);
        grafoNDNP.addEdge(3.0,1,4);
        grafoNDNP.addEdge(0.5,2,3);
        grafoNDNP.addEdge(1.5,3,2);


        grafoNDNP.print();




	// write your code here
    }
}
