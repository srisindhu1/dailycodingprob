package dailycodingproblems;
//Given the root to a binary search tree, find the second largest node in the tree.
class node{
    int data;
    node left,right;
    node(int d)
    {
        data=d;
        left=right=null;

    }


}
public class Secondlargestnode_14_05_2022 {
    node root;
    Secondlargestnode_14_05_2022()
    {
        root=null;
    }
    public void insert(int data)
    {
        this.root=this.insertrec(root,data);
    }
    node insertrec(node nod,int data){
        if(nod==null){
            this.root=new node(data);
            return this.root;
        }
        if(data< nod.data)
        {
            nod.left=this.insertrec(nod.left,data);
        }else{
            nod.right=this.insertrec(nod.right,data);
        }
        return nod;
    }
    public class count{
        int C=0;
    }
    public void secondlarge(node root, count c)
    {
        if(root==null||c.C>=2)
        {
            return;
        }

        this.secondlarge(root.right,c);
        c.C++;
        if(c.C==2){
        System.out.println("second largest element is"+root.data);}
        this.secondlarge(root.left,c);
    }
    public void secondlargest(node root){
        count c= new count();
        this.secondlarge(root,c);
    }



}
