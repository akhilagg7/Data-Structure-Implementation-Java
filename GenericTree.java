import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode{
    int data;
    ArrayList<TreeNode> children;

    public TreeNode(int data)
    {
        this.data=data;
        children=new ArrayList<>();
    }
}

public class GenericTree
{
    public static Scanner scn=new Scanner(System.in);

    public static TreeNode takeInputLevelWise()
    {
        System.out.println("Enter root data ");
        int rootData=scn.nextInt();
        Queue<TreeNode> pendingNodes=new LinkedList<>();
        TreeNode root=new TreeNode(rootData);
        pendingNodes.add(root);
        while(pendingNodes.size()!=0)
        {
            TreeNode node=pendingNodes.remove();
            System.out.println("enter number of children of "+node.data);
            int numchild=scn.nextInt();
            for(int i=0;i<numchild;i++)
            {
                System.out.println("Enter value of "+i+"th node of "+node.data);
                int numData=scn.nextInt();
                TreeNode child=new TreeNode(numData);
                node.children.add(child);
                pendingNodes.add(child);

            }
        }
        return root;
    }

    public static TreeNode takeInput()
    {
        System.out.println("Enter root node");
        int n=scn.nextInt();
        TreeNode root=new TreeNode(n);
        System.out.println("enter num of children");
        int numchild=scn.nextInt();
        for(int i=0;i<numchild;i++)
        {
            TreeNode child=takeInput();
            root.children.add(child);
        }
        return root;
    }


    public static void print(TreeNode root)
    {
        String s=root.data+" : ";
        for(int i=0;i<root.children.size();i++)
        {
            s+=root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++)
        {
            print(root.children.get(i));
        }
    }

    public static void printLevelWise(TreeNode root)
    {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0)
        {
            TreeNode node=queue.remove();
            String s=node.data+" : ";
            for(int i=0;i<node.children.size();i++)
            {
                s+=node.children.get(i).data+" , ";
                queue.add(node.children.get(i));
            }
            System.out.println(s);
        }
    }
    public static void main(String args[])
    {
        // TreeNode root=takeInput();
        TreeNode root=takeInputLevelWise();
        printLevelWise(root);
    }
}