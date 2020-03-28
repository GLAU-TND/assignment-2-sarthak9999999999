
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;
public class MyMain {
    // executable class
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(7);
        obj.insert(1);
        obj.insert(20);
        obj.insert(4);
        obj.insert(5);
        System.out.println("ALL Left Nodes");
        obj.printLeftNode();
        System.out.println("Count of Node not having left node");
        obj.countNotLeft();
    }
}

