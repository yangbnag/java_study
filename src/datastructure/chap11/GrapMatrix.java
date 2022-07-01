package datastructure.chap11;

// 탐색에 초점을 맞춘 알고리즘
// 인접행렬 방식 그래프 구현 - 2차원 배열
public class GrapMatrix {

    // 배열을 쓰기 때문에 크기가 고정되어 있을수 밖에 없다. - 단점
    // 탐색시 메모리활용이 효율적이다. - 장점

    // 최대 정점 개수
    public static final int MAX = 50;

    //그래프의 인접방향을 저장할 인접 행렬
    private int[][] adjMatrix;

    //정점들을 모아둘 배열
    private Vertex[] vertices;

    //현재 그래프에 저장되어 있는 정점의 수 [실제 들어있는 수]
    private int numOfVertice;

    public GrapMatrix(){
        adjMatrix = new int[MAX][MAX];
        vertices = new Vertex[MAX];
    }

    // 그래프에 정점을 추가하는 메서드
    public void addVertex(Vertex v){
        // 정점 객체에 id부여 0부터 순차적 증가 [아이디를 인접행렬의 인덱스와 일치시키는 중]
        v.setId(numOfVertice);

        // 정점 배열에 추가
        vertices[numOfVertice++] = v;
    }

    // 간선 연결하기 (무방향 그래프)
    public void addEdge(Vertex departure, Vertex destination) {

        // 인접 행렬에 연결정보 저장
        adjMatrix[departure.getId()][destination.getId()] = 1;
        adjMatrix[destination.getId()][departure.getId()] = 1;
    }

    // 인접 행렬 출력
    public void showGraph() {
        System.out.print("    ");
        for (int i = 0; i < numOfVertice; i++) {
            System.out.print(vertices[i].getData() + " ");
        }
        System.out.println();

        for (int i = 0; i < numOfVertice; i++) {
            System.out.printf("%s | ", vertices[i].getData());
            for (int j = 0; j < numOfVertice; j++) {
                System.out.printf("%d ", adjMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
