import java.util.Scanner;
class Node
{
    int no, pow;
    Node next;
}
class PolyAddLL
{
    Node first, last;
    PolyAddLL()
    {
        first=last=null;
    }
    void insertElement(int no, int pow)
    {
        Node newrec=new Node();
        newrec.no=no;
        newrec.pow=pow;
        newrec.next=null;
       
        if(first==null)
            first=last=newrec;
        else
        {
            last.next=newrec;
            last=newrec;
        }
    }
    void display()
    {
        Node q=first;
        while(q!=null)
        {
            if(q==first && q.next!=null)
            {    if(q.no>0)
                    System.out.print(" "+q.no+"x^"+q.pow);
                else if(q.no<0)
                    System.out.print(q.no+"x^"+q.pow);
            }
            else if(q.no>0 && q.pow!=0)
            System.out.print(" +"+q.no+"x^"+q.pow);
            else if(q.no<0 && q.pow!=0)
                    System.out.print(" "+q.no+"x^"+q.pow);
           
            if(q.pow==0)
            {
                if(q.no>0)
                    System.out.print(" +"+q.no);
                else if(q.no<0)
                    System.out.print(" "+q.no);
                else
                    System.out.print(" +0");
            }   
            q=q.next;
        }
        System.out.println();
    }
    void addPoly(PolyAddLL a, PolyAddLL b)
    {
        Node na,nb;
        na=a.first;
        nb=b.first;
       
        while(na!=null && nb!=null)
        {
            if(na.pow>nb.pow)
            {
                insertElement(na.no,na.pow);
                na=na.next;
            }
            else if(na.pow<nb.pow)
            {
                insertElement(nb.no,nb.pow);
                nb=nb.next;
            }
            else
            {
                insertElement(na.no+nb.no,na.pow);
                na=na.next;
                nb=nb.next;
            }
        }
       
        if(na==null && nb!=null)
        {
            while(nb!=null)
            {
                insertElement(nb.no,nb.pow);
                nb=nb.next;
            }
        }
        else if(na!=null && nb==null)
        {
            while(na!=null)
            {
                insertElement(na.no,na.pow);
                na=na.next;
            }
        }
    }
}
class PolyAdd
{
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        PolyAddLL a=new PolyAddLL();
        PolyAddLL b=new PolyAddLL();
        PolyAddLL c=new PolyAddLL();
        int i,da,db,no,pow;
       
        System.out.print("Enter degree of Polynimial 1: ");
        da=src.nextInt();
        System.out.print("Enter Coefficients in descending order: \n");
        for(i=da;i>0;i--)
        {
            System.out.print("Coefficient of x^"+i+" : ");
            no=src.nextInt();
            a.insertElement(no,i);
        }
        System.out.print("Constant: ");
        no=src.nextInt();
        a.insertElement(no,0);
       
        System.out.print("Enter degree of Polynimial 2: ");
        db=src.nextInt();
        System.out.print("Enter Coefficients in descending order: \n");
        for(i=db;i>0;i--)
        {
            System.out.print("Coefficient of x^"+i+" : ");
            no=src.nextInt();
            b.insertElement(no,i);
        }
        System.out.print("Constant: ");
        no=src.nextInt();
        b.insertElement(no,0);
       
        c.addPoly(a,b);
        System.out.print("Polynomial 1:                ");
        a.display();
        System.out.print("Polynomial 2:                ");
        b.display();
        System.out.print("Polynomial 1+Polynomial 2:   ");
        c.display();
    }   
}