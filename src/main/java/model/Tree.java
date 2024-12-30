package model;

public class Tree {

    public Tree left;
    public Tree right;
    public int value;

    public Tree(int value) {
        this.value = value;
    }

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void preOrder() {
        System.out.print(this.value + " ");
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    public void posOrder() {
        if (this.left != null) {
            this.left.posOrder();
        }
        if (this.right != null) {
            this.right.posOrder();
        }
        System.out.print(this.value + " ");
    }

    public void inOrder() {
        if (this.left != null) {
            this.left.inOrder();
        }
        System.out.print(this.value + " ");
        if (this.right != null) {
            this.right.inOrder();
        }
    }



}
