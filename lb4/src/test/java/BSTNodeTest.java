import org.example.BSTNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BSTNodeTest {

        Map<Integer, String> tree;

        @BeforeEach
        void Test1Init() {
            tree = new HashMap<>();

            tree.put(49, "Apple");
            tree.put(12, "Orange");
            tree.put(83, "Banana");
            tree.put(22, "Pineapple");
            tree.put(56, "Mango");
            tree.put(75, "Grapes");
            tree.put(32, "Pear");
            tree.put(47, "Peach");
            tree.put(91, "Strawberry");
            tree.put(18, "Watermelon");
            tree.put(65, "Carrot");
            tree.put(38, "Blueberry");
            tree.put(72, "Cherry");
            tree.put(43, "Lemon");
            tree.put(87, "Kiwi");
            tree.put(10, "Pomegranate");
            tree.put(27, "Cucumber");
            tree.put(52, "Plum");
            tree.put(61, "Tomato");
            tree.put(99, "Grapefruit");
        }


    @Test
    void Test2Traversal() {
        BSTNode bstNode = new BSTNode();
        for (Map.Entry<Integer, String> item: tree.entrySet()) {
            bstNode.put(item.getKey(), item.getValue());
        }

        Assertions.assertEquals(20, tree.size());
    }

    @Test
    void Test3() {
        BSTNode bstNode = new BSTNode();

        for (Map.Entry<Integer, String> item: tree.entrySet()) {
            bstNode.put(item.getKey(), item.getValue());
        }

        System.out.println();
        Assertions.assertEquals("Tomato",bstNode.get(61));
        Assertions.assertEquals("Watermelon",bstNode.get(18));
        Assertions.assertNull(bstNode.get(192));
        Assertions.assertNull(bstNode.get(94));
    }


    @Test
    void Test4() {
        BSTNode bstNode = new BSTNode();

        for (Map.Entry<Integer, String> item: tree.entrySet()) {
            bstNode.put(item.getKey(), item.getValue());
            if(item.getKey()!=99)
            {
                bstNode.put(item.getKey(), item.getValue());
            }
        }

        bstNode.put(99,"Onion");
        System.out.println(bstNode.get(99));
        Assertions.assertEquals("Onion", bstNode.get(99));
        bstNode.put(99, "Avocado");

        bstNode.treeTraversal();
        System.out.println();
        Assertions.assertEquals(20, bstNode.size());

        System.out.println();
        Assertions.assertEquals("Avocado", bstNode.get(99));
    }

    @Test
    void Test5() {
        BSTNode bstNode = new BSTNode();

        for (Map.Entry<Integer, String> item: tree.entrySet()) {
            bstNode.put(item.getKey(), item.getValue());
        }

        System.out.println();
        bstNode.delete(18);

        Assertions.assertEquals(19, bstNode.size());
        Assertions.assertNull(bstNode.get(18));
    }
}

