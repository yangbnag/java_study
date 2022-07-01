package datastructure.chap12;

import datastructure.chap11.Vertex;

public class ListTest {

    public static void main(String[] args) {

        GraphList gl = new GraphList();

        // 정점 생성
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");

        // 정점을 그래프에 추가
        gl.addVertex(A);
        gl.addVertex(B);
        gl.addVertex(C);
        gl.addVertex(D);
        gl.addVertex(E);
        gl.addVertex(F);
        gl.addVertex(G);
        gl.addVertex(H);

        // 정점들을 간선으로 연결
        gl.addEdge(A, B);
        gl.addEdge(A, F);
        gl.addEdge(A, G);
        gl.addEdge(B, C);
        gl.addEdge(B, D);
        gl.addEdge(D, E);
        gl.addEdge(G, H);

        // 그래프 출력
        gl.showGraph();

        /*
                 A
               / \ \
             B   F  G
           /  \      \
          C    D      H
                \
                 E

         */

//        gl.DFS(A);
          gl.DFS2(A);



    }
}