package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    private class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }

    //汇总的思路
    //前序遍历返回List集合
    public static List<Integer> perorder(Node node){
        List<Integer> list = new ArrayList();
        if(node==null){
            return list;
        }
        list.add(node.data);
        List<Integer> listleft = perorder(node.left);
        List<Integer> listright = perorder(node.right);
        list.addAll(listleft);
        list.addAll(listright);
        return list;
    }
    //一般的思路
    public static List<Integer> perorder2(Node node){
        List<Integer> list = new ArrayList<>();
        process(list,node);
        return list;
    }
    public static void process(List<Integer> list,Node node){
        if(node==null){
            return;
        }
        list.add(node.data);
        process(list,node.left);
        process(list,node.right);
    }
    //找公共祖先
    public static Node commonNode(Node root,Node p,Node q){
        if(root==q||root==p){
            return root;
        }
        boolean pleftNode = search(root.left,p);
        boolean qleftNode = search(root.right,q);
        if(pleftNode&&qleftNode){
            return commonNode(root.left,p,q);
        }
        if(!pleftNode&&!qleftNode){
            return commonNode(root.right,p,q);
        }
        return root;
    }
    public static boolean search(Node node,Node p){
        if(node==null){
            return false;
        }
        if(node==p){
            return true;
        }
        if(search(node.left,p)){
            return true;
        }
        return search(node.right,p);
    }


    //找包含data的节点，找到返回节点的引用，否则返回null
    public static Node searchNode(Node root,int data){
        if(root==null){
            return null;
        }
        if(root.data==data){
            return root;
        }
        Node leftNode = searchNode(root.left,data);
        if(leftNode==null){
            return searchNode(root.right,data);
        }else{
            return leftNode;
        }
    }
}


















