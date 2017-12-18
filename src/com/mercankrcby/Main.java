package com.mercankrcby;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jxl.read.biff.BiffException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, BiffException {

        long startTime = System.currentTimeMillis();
        // ... zaman alan bazı işlemler ...

        // write your code here
        ExcelDataRead ExcelReader=new ExcelDataRead("/Users/macboookair/Desktop/deneme.xls");
        ArrayList<FlightData> fDataList = new ArrayList<FlightData>();
        fDataList=ExcelReader.ExceldenOku();

        for(int i=0;i<fDataList.size();++i)
        {
            FlightOperationsControl fOpControl=new FlightOperationsControl();
            String controlResult=fOpControl.desicionFlightSituation(fDataList.get(i)).toString();
            System.out.println(controlResult);
            fOpControl.assignStatus(fDataList.get(i));
            if(controlResult.equals(FlightOperationsControl.FlightSituation.CRITICAL))
            {
                fOpControl.assignWorkerForCriticalSituation(fDataList.get(i));
            }
            //System.out.println(fDataList.get(i).status);
            //System.out.println(controlResult);
            //fOpControl.assignWorkerForPassenger(fDataList.get(i));
        }
/*

        Graph graph = new Graph();

        Vertex[] vertices = new Vertex[5];

        for(int i = 0; i < vertices.length; i++){

            vertices[i] = new Vertex("" + i);

            graph.addVertex(vertices[i], true);

        }

        //illustrate the fact that duplicate edges aren't added

        for(int i = 0; i < vertices.length - 1; i++){

            for(int j = i + 1; j < vertices.length; j++){

                graph.addEdge(vertices[i], vertices[j]);

                graph.addEdge(vertices[i], vertices[j]);
                graph.addEdge(vertices[j], vertices[i]);

            }

        }

        for(int i = 0; i < vertices.length; i++){

            System.out.println(vertices[i]);

            for(int j = 0; j < vertices[i].getNeighborCount(); j++){

                System.out.println(vertices[i].getNeighbor(j));

            }

            System.out.println();

        }


        graph.addVertex(new Vertex("3"), true);

        for(int i = 0; i < vertices.length; i++){

            System.out.println(vertices[i]);

            for(int j = 0; j < vertices[i].getNeighborCount(); j++){

                System.out.println(vertices[i].getNeighbor(j));

            }

            System.out.println();

        }

        System.out.println("Vertex 5: " + graph.getVertex("5")); //null

        System.out.println("Vertex 3: " + graph.getVertex("3")); //Vertex 3

        System.out.println("Graph Contains {1, 2}: " +

                graph.containsEdge(new Edge(graph.getVertex("1"), graph.getVertex("2"))));

        System.out.println(graph.removeEdge(new Edge(graph.getVertex("1"), graph.getVertex("2"))));

        System.out.println("Graph Contains {1, 2}: " + graph.containsEdge(new Edge(graph.getVertex("1"), graph.getVertex("2"))));

        System.out.println("Graph Contains {2, 3} " + graph.containsEdge(new Edge(graph.getVertex("2"), graph.getVertex("3"))));

        System.out.println(graph.containsVertex(new Vertex("1"))); //true

        System.out.println(graph.containsVertex(new Vertex("6"))); //false

        System.out.println(graph.removeVertex("2")); //Vertex 2

        System.out.println(graph.vertexKeys()); //[3, 1, 0, 4]
*/
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double minutes = ((double)estimatedTime/1000)*4;
        //50'lik data icin 0.365 saniye surmektedir
        System.out.println(minutes);

    }

        /*
        try {
            ExcelReader.ExceldenOku();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }*/
}


