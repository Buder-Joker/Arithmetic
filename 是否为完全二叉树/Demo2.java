package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2 {
    private class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    //判断是否为完全二叉树
    /*
    1 . 不断层式遍历，直到遇到空
    2 . 检查队列剩余结点是否还有null
     */
    public static boolean iserchaTree(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(true){
            Node front = queue.poll();
            if(front==null){
                break;
            }
             queue.add(root.right);
        }

        while(!queue.isEmpty()){
            Node front = queue.poll();
            if(front!=null){
                return false;
            }
        }
        return true;
    }
}
