package service;

import model.Tree;

public class TreeService {

    public static void createTree() {
        Tree tree = new Tree(1,
                        new Tree(2,
                            new Tree(3),
                            new Tree(4)
                        ),
                        new Tree(5,
                            new Tree(6),
                            new Tree(7)
                        )
        );
        System.out.println("PreOrder:");
        tree.preOrder();
        System.out.println("\nPosOrder:");
        tree.posOrder();
        System.out.println("\nInOrder:");
        tree.inOrder();
        System.out.println();
    }
}
