package bst;

import java.util.*;

/**
 *
 * @author Amit Kumar
 */
class Node {

    Node left, right;
    int data;

    Node(int item) {
        this.data = item;
        left = right = null;
    }
}

public class BST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {

            HashMap<Integer, Node> h = new HashMap<>();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0) {

                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);

                Node parent = h.get(n1);
                if (parent == null) {
                    parent = new Node(n1);
                    h.put(n1, parent);
                    if (root == null) {
                        root = parent;
                    }
                }

                Node child = new Node(n2);
                if (lr == 'L') {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
                h.put(n2, child);
                n--;
            }
             System.out.println(h);
            t--;
        }
        
    }

}
