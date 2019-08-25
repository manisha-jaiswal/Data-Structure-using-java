import java.io.*;
class Node
{  public int data;
   public Node next;
   public Node(int x)
 {
  data=x;
 }
  public void display()
 {
  System.out.println(data+" ");
 }
}
class Stacker
{
    public Node first;
    public Stacker()
    {
        first=null;
    }
    public boolean isEmpty()
    {
        return(first==null);
    }
    public void push(int value)
    {
        Node newnode=new Node(value);
        newnode.next=first;
        first=newnode;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("\n Stack is Empty...");
            return 0;
        }
        else
        {
            int r1=first.data;
            first=first.next;
            return r1;
        }
 
    }
    public void display()
    {
        Node current=first;
        while(current!=null)
        {
            System.out.print(" "+current.data);
            current=current.next;
        }
        System.out.println("");
    }
}
class StackList
{
    public static void main(String arg[]) throws IOException
    {
        Stacker a1=new Stacker();
        int ch;
        while((boolean)true)
        {
            System.out.println("Select \n1.Push \n2.Pop \n3.Display \n4.Exit");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            ch=Integer.parseInt(br.readLine());
            if(ch==4)
                break;
            else
            {
                switch(ch)
                {
           case 1:                
              System.out.println("Enter number of elements to push: ");
              int n1=Integer.parseInt(br.readLine());
              System.out.println("\nEnter elements: ");
              for(int i=0; i<n1; i++)
                    {
                        a1.push(Integer.parseInt(br.readLine()));
                    }
                    break;
           case 2:
              
              
    
             
              System.out.println(a1.pop()+" is poped from stack... ");
              
              break;
           case 3:
              System.out.println("\nThe current stack items:");
              a1.display();
              break;
              default:
              break;
    }
    }
   }
  }
}