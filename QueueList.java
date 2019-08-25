import java.io.*;
class Node
{
    public int data;
    public Node next;
    public Node(int x)
    {
        data=x;
    }
    public void displayNode()
    {
        System.out.print(data+"  ");
    }
}
class LinkList
{
    private Node first;
    private Node last;
    public LinkList()
    {
        first=null;
        last=null;
    }
    public void insertLast(int x)
    {
        Node newNode=new Node(x);
        newNode.next=null;
        if(isEmpty())
            first=newNode;
        else
            last.next=newNode;
        last=newNode;
    }
    public int deleteFirst()
    {
        int t=first.data;
        if(first.next==null)
            last=null;
        first=first.next;
        return t;
    }
    public int peekFirst()
    {
        return(first.data);
    }
    public boolean isEmpty()
    {
        return(first==null);
    }
    public void displayList()
    {
        Node current=first;
        while(current!=null)
        {
            current.displayNode();
            current=current.next;
        }
    }
}
class Queue
{
    private LinkList l;
    public Queue()
    {
        l=new LinkList();
    }
    public void insert(int x)
    {
        l.insertLast(x);
        System.out.println("Inserted");
    }
    public int delete()
    {
        return l.deleteFirst();
    }
    public boolean isQueueEmpty()
    {
        return l.isEmpty();
    }
    public void display()
    {
        l.displayList();
    }
    public int peek()
    {
        return l.peekFirst();
    }
}
class QueueList
{
    public static void main(String args[])throws IOException
    {
        Queue q=new Queue();
        int ch,d;
        while((boolean)true)
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter Your Choice: ");
            ch=Integer.parseInt(br.readLine());
            if(ch==5)
                break;
            else
            {
                switch(ch)
                {
                case 1:
                    System.out.println("Enter Number of Elements");
                    int n1=Integer.parseInt(br.readLine());
                    System.out.println("\nEnter elements: ");
                    for(int i=0; i<n1; i++)
                    {
                        d=Integer.parseInt(br.readLine());
                        q.insert(d);
                    }
 
                    break;
                case 2:
                    if(q.isQueueEmpty())
                        System.out.println("Queue is Empty ");
                    else
                    {
                        d=q.delete();
                        System.out.println("Deleted data:-  "+d);
                    }
                    break;
                case 3:
                    if(q.isQueueEmpty())
                        System.out.print("Queue is Empty ");
                    else
                    {
                        d=q.peek();
                        System.out.println("First item:-  "+d);
                    }
                    break;
                case 4:
                    if(q.isQueueEmpty())
                        System.out.println("Queue is Empty ");
                    else
                    {
                        System.out.println("Datas in Queue ");
                        q.display();
                    }
                    break;
                default:
                    System.out.println("Invalid choice ");
                }
            }
            System.out.println(" ");
        }
    }
}