import java.util.*;

 



class Node

{

    protected int data;

    protected Node link;

 


    public Node()

    {

        link = null;

        data = 0;

    }    



    public Node(int d,Node n)

    {

        data = d;

        link = n;

    }    

  

    public void setLink(Node n)

    {

        link = n;

    }    

  

    public void setData(int d)

    {

        data = d;

    }    

   
    public Node getLink()

    {

        return link;

    }    

      public int getData()

    {

        return data;

    }

}    

 



class Dequeue

{

    private Node front, rear;

    private int size;

 

 
    public Dequeue()

    {

        front = null;

        rear = null;

        size = 0;

    }    

   

    public boolean isEmpty()

    {

        return front == null;

    }    

    

    public int getSize()

    {

        return size;

    }

  
    public void clear()

    {

        front = null;

        rear = null;

        size = 0;

    }

       public void insertAtFront(int val)

    {

        Node nptr = new Node(val, null);    

        size++ ;    

        if (front == null) 

        {

            front = nptr;

            rear = front;

        }

        else 

        {

            nptr.setLink(front);

            front = nptr;

        }

    }

        public void insertAtRear(int val)

    {

        Node nptr = new Node(val,null);    

        size++ ;    

        if (rear == null) 

        {

            rear = nptr;

            front = rear;

        }

        else 

        {

            rear.setLink(nptr);

            rear = nptr;

        }

    }    

   
    public int removeAtFront()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception");

        Node ptr = front;

        front = ptr.getLink();

 

        if (front == null)

            rear = null;

        size-- ;

 

        return ptr.getData();

    }

   
    public int removeAtRear()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception");

        int ele = rear.getData();

        Node s = front;

        Node t = front;

        while (s != rear)

        {

            t = s;

            s = s.getLink();

        }

        rear = t;

        rear.setLink(null);

        size --;

 

        return ele;

    }        

      public int peekAtFront()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception");

        return front.getData();

    }

  
    public int peekAtRear()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception");

        return rear.getData();

    }    

    /*  Function to display the status of the queue */

    public void display()

    {

        System.out.print("\nDequeue = ");

        if (size == 0)

        {

            System.out.print("Empty\n");

            return ;

        }

        Node ptr = front;

        while (ptr != rear.getLink() )

        {

            System.out.print(ptr.getData()+" ");

            ptr = ptr.getLink();

        }

        System.out.println();        

    }

}

 


public class DoubleEndedQueue

{    

    public static void main(String[] args)

    {

        Scanner scan = new Scanner(System.in); 

        
        Dequeue dq = new Dequeue();            

       
        System.out.println("Dequeue Test\n"); 

        char ch;        

        do

        {

            System.out.println("\nDequeue Operations");

            System.out.println("1. insert at front");

            System.out.println("2. insert at rear");

            System.out.println("3. delete at front");

            System.out.println("4. delete at rear");

           
            System.out.println("5. check empty");

          
            int choice = scan.nextInt();

            switch (choice)

            {

            case 1 : 

                System.out.println("Enter integer element to insert");

                dq.insertAtFront( scan.nextInt() );

                break;  

            case 2 : 

                System.out.println("Enter integer element to insert");

                dq.insertAtRear( scan.nextInt() );

                break;                         

            case 3 : 

                try 

                {

                    System.out.println("Removed Element = "+ dq.removeAtFront());

                }

                catch (Exception e)

                {

                    System.out.println("Error : " + e.getMessage());

                }    

                break;

            case 4 : 

                try 

                {

                    System.out.println("Removed Element = "+ dq.removeAtRear());

                }

                catch (Exception e)

                {

                    System.out.println("Error : " + e.getMessage());

                }    

                break;                         

         

            case 5 : 

                System.out.println("Empty status = "+ dq.isEmpty());

                break; 
                   

            default : 

                System.out.println("Wrong Entry \n ");

                break;

            }                

           

            dq.display();

 

            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);            

        } while (ch == 'Y'|| ch == 'y');                                                            

    } 

}