package datastructure.chap11;

public class MatrixTest {
    public static void main(String[] args) {

        // 그래프 생성
        GrapMatrix gm = new GrapMatrix();

        // 정점 생성
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");

        // 정점 그래프에 추가
        gm.addVertex(A);
        gm.addVertex(B);
        gm.addVertex(C);
        gm.addVertex(D);
        gm.addVertex(E);

        // 정점들을 간선으로 연결
        gm.addEdge(A,B);
        gm.addEdge(B,E);
        gm.addEdge(E,D);
        gm.addEdge(B,C);

        //그래프 출력
        gm.showGraph();
    }
}
