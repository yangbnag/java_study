package datastructure.chap10.binarytree;

class Node{
    private int data; // 트리에 저장할 데이터
    private Node leftChild; // 왼쪽자식
    private Node rightChild; // 오른쪽 자식


    public Node(int date) {
        this.data = date;
    }

    public int getDate() {
        return data;
    }

    public void setDate(int date) {
        this.data = date;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return String.format("[%d]",data);
    }
}
public class Binarytree {

    private Node root; // 트리의 루트 노드

    //============삽입=============//
    public void add(int data) {
        // 삽입할 데이터 노드 생성
        Node newNode = new Node(data);

        // 빈 트리면 새로운 노드를 루트로 지정
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;

                // 삽입할 데이터가 타겟 노드의 데이터보다 작은 경우
                if (data < current.getDate()) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;

                    } else { // 큰 경우
                        current = current.getRightChild();
                        if (current == null) {
                            parent.setRightChild(newNode);
                            return;
                        }
                    }
                }
            }

        }

        //============순회=============//

        // 전위 순회(pre order) - 중 전 후
        public void preOrder (Node tempRoot){
            if (tempRoot != null) {
                System.out.printf("%d ", tempRoot.getDate());
                preOrder(tempRoot.getLeftChild());
                preOrder(tempRoot.getRightChild());

            }


            // 1. 루트 (중앙)노드 값을 출력
            // 2. 왼쪽 자식으로 재귀호출 반복
            // 3. 오른쪽 자식 쪽으로 재귀호출 반복
            // 더이상 순회할 노드가 없을때 까지
        }


    }
}
