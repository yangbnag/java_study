package datastructure.chap11;

public class GraphTest {
    public static void main(String[] args) {
        // 그래프 생성
        GraphList gl = new GraphList();

        // 정점 생성
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");

        // 정점 그래프에 추가
        gl.addVertex(A);
        gl.addVertex(B);
        gl.addVertex(C);
        gl.addVertex(D);
        gl.addVertex(E);

        // 정점들을 간선으로 연결
        gl.addEdge(A,B);
        gl.addEdge(B,E);
        gl.addEdge(E,D);
        gl.addEdge(B,C);

        //그래프 출력
        gl.showGraph();
    }
}
