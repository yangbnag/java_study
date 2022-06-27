package datastructure.chap10.binarytree;
import com.sun.source.tree.Tree;

import java.util.TreeSet;
import java.util.TreeMap;
public class Test {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
///*
//                              50
//
//                27                              68
//
//        12              36              55              82
//
//    7      19      **       49      **      **      76      **
//
//         */
        tree.add(50);
        tree.add(27);
        tree.add(68);
        tree.add(12);
        tree.add(36);
        tree.add(55);
        tree.add(82);
        tree.add(7);
        tree.add(19);
        tree.add(49);
        tree.add(76);
//
//        tree.preOrder(tree.getRoot());
//
//        System.out.println("\n==================탐색===================");
//        Node found = tree.find(1);
//        if(found==null) System.out.println("탐색 실패!!");
//        System.out.println(found);
//        tree.add(3);
//        tree.add(100);
//
//        System.out.println(tree.findMin());
//        System.out.println(tree.findMax());

        tree.delete(82);
        tree.display();

        // 트리의 문제점
        BinaryTree tree2 = new BinaryTree();
        tree2.add(50);
        tree2.add(40);
        tree2.add(30);
        tree2.add(20);

        System.out.println("=========이진트리의 문제점===========");
        tree2.display();

        System.out.println("=============API 트리사용===============");

        // TreeSet : Set형태로 Tree를 구현
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(27);
        treeSet.add(30);
        treeSet.add(45);
        treeSet.add(70);
        treeSet.add(90);

        System.out.println(treeSet);

        // TreeMap : Map 형태로 트리를 구현
        TreeMap<String, Integer> TreeMAp = new TreeMap<>();

        TreeMAp.put("짹짹이",44);
        TreeMAp.put("멍멍이",30);
        TreeMAp.put("야옹이",55);
        TreeMAp.put("강쥐",56);
        TreeMAp.put("쥐쥐쥐",70);

        System.out.println(TreeMAp);


    }
}
