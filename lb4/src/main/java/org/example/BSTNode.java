package org.example;

import java.util.NoSuchElementException;

public class BSTNode {
    private Node root;

    private class Node {
        private int key;
        private String str;
        private Node left, right;
        private int N;

        public Node(int key, String str, int N) {
            this.key = key;
            this.str = str;
            this.N = N;
        }

    }

        public int size()
        {
            return size(root);
        }
        private int size(Node x)
        {
            if (x == null)
                return 0;
            else
                return x.N;
        }

        public String get(int key)
        {return get(root, key);}

        private String get(Node x, int key)
        {
            if (x == null) return null;

            if (key < x.key)
                return get(x.left, key);
            else if (key > x.key)
                return get(x.right, key);
            else
                return x.str;
        }

        public void put(int key, String str)
        {
            root = put(root, key, str);
        }

        private Node put(Node x, int key, String str)
        {
            if (x == null)
                return new Node(key, str, 1);

            if (key < x.key)
                x.left = put(x.left, key, str);
            else if (key > x.key)
                x.right = put(x.right, key, str);
            else
                x.str = str;
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }

        public void delete(int key)
        {
            root = delete(root, key);
        }

        private Node delete(Node x, int key) {
            if (x == null)
                return null;

            if (key < x.key)
                x.left = delete(x.left, key);
            else if (key > x.key)
                x.right = delete(x.right, key);
            else
            {
                if (x.right == null)
                    return x.left;
                if (x.left == null)
                    return x.right;
                Node t = x;
                x = min(t.right);
                x.right = deleteMin(t.right);
                x.left = t.left;
            }
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }

        public int min() {
            if (size() == 0) throw new NoSuchElementException("Invokes the min() function on a symbol table that has no elements.");
            return min(root).key;
        }

        private Node min(Node x) {
            if (x.left == null) return x;
            return min(x.left);
        }


        public void deleteMin()
        {
            root = deleteMin(root);
        }
        private Node deleteMin(Node x)
        {
            if (x.left == null)
                return x.right;
            x.left = deleteMin(x.left);
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }

        public void treeTraversal()
        {
            treeTraversal(root);
        }

        private void treeTraversal(Node x)
        {
            if (x != null)
            {
                System.out.println(x.str + " ");
                treeTraversal(x.left);
                treeTraversal(x.right);
            }
        }
    }


