import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data)
    {
        this.data=data;
    }

}

public class BinaryTree{
    public static Scanner scn=new Scanner(System.in);
    public static BinaryTreeNode takeInput()
    {
        System.out.println("enter root data");
        int rootData=scn.nextInt();
        if(rootData==-1)
        {
            return null;
        }    
        BinaryTreeNode root=new BinaryTreeNode(rootData);
        root.left=takeInput();
        root.right=takeInput();
        return root;

    }

    public static void print(BinaryTreeNode root)
    {
        if(root==null)
        {
            return ;
        }

        String s=root.data+" : ";
        if(root.left!=null)
        {
            s+="L:"+root.left.data+" , .";
        }
        if(root.right!=null)
        {
            s+="R:"+root.right.data;
        }
        System.out.println(s);
        print(root.left);
        print(root.right);
    }

    public static BinaryTreeNode takeInputLevelWise()
    {
        int rootData;
        System.out.println("Enter root data");
        rootData=scn.nextInt();
        if(rootData==-1)
        {
            return null;
        }
        BinaryTreeNode root=new BinaryTreeNode(rootData);
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0)
        {
            BinaryTreeNode front=queue.remove();
            System.out.println("Enter left child of  " + front.data);
            int leftChild=scn.nextInt();
            if(leftChild!=-1)
            {
                BinaryTreeNode lchild=new BinaryTreeNode(leftChild);
                front.left=lchild;
                queue.add(lchild);
            }
            System.out.println("enter right child of "+front.data);
            int rightChild=scn.nextInt();
            if(rightChild!=-1)
            {
                BinaryTreeNode rchild=new BinaryTreeNode(rightChild);
                front.right=rchild;
                queue.add(rchild);
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(queue.size()!=0)
        {
            String s="";
            BinaryTreeNode front=queue.remove();
            s+=front.data+" : ";
            if(front.left!=null)
            {
                s+="L: "+front.left.data+", ";
                queue.add(front.left);
            }
            if(front.right!=null)
            {
                s+=front.right.data;
                queue.add(front.right);
            }
            System.out.println(s);
            
        }

    }
    public static void main(String args[])
    {
        BinaryTreeNode root=takeInputLevelWise();
        printLevelWise(root);
    }
}