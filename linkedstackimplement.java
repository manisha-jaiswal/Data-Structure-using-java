import java.util.*;
class linkedliststack
{
	int data;
linkedliststack link;
linkedliststack()
{
link=null;
data=0;
}
public linkedliststack(int d,linkedliststack n)
{
data=d;
link=n;
}
public void setlink(linkedliststack n)
{
link=n;
}
public void setdata(int d)
{
data=d;
}
public linkedliststack getlink()
{
return link;
}
public int getdata()
{
return data;
}
}
class linkedstack
{
linkedliststack top;
int size;
public linkedstack()
{
top=null;
size=0;
}
public boolean isempty()
{
return top==null;
}
public int getsize()
{
return size;
}
public void push(int data)
{
linkedstack nptr=new linkedliststack(data,null);
if(top==null)
top=nptr;
else
{
nptr.setlink(top);
top=nptr;
}
size++;
}
public int pop()
{
if(isempty())
throw new nosuchelementexception("underflow exception");
linkedliststack ptr=top;
top=ptr.getlink();
size--;
return ptr.getdata();
}

public int peek()
{
if(isempty())
throw new nosuchelementexception("underflow exception");
return top.getdata();
}
public void display()
{
System.out.println("\nstack=");
if(size=0)
{
System.out.println("empty\n");
return;
}
linkedliststack ptr=top;
while(ptr!=null)
{
System.out.print(ptr.getdata()+" ");
ptr=ptr.getlink();
}
System.out.println();
}
}
public class linkedstackimplement
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
linkedstack is=new linkedstack();
System.out.println("linkedstack test\n");
char ch;
{
System.out.println("\nlinked stack operations\n1.push\n2.pop\n3.peek\n4.check empty\n5.size");
int choice=scan.nextInt();
switch(choice)
{
case1:
System.out.println("enter integer element to push");
is.push(scan.nextInt());
break;
case 2:
try
{
System.out.println("popped element="+ is.pop());
}
catch(exception e)
{
System.out.println("error"+e.getmessage());
}
break;
case 3:
try
{
System.out.println("peek element="+is.peek());
}
catch(exception e)
{
System.out.println("error"+e.getmessage());
}
break;
case 4:
System.out.println("empty status="+is.isempty());
break;
case 5:
System.out.println("size="+is.getsize());
is.display();
break;
case 6:
System.out.println("stack=");
break;
default:
System.out.println("wrong entry\n");
break;
}
is.display();
System.out.println("\ndo u want to continue(type y or n)\n");
ch=scan.next().charAt(0);
while(ch=='Y'||ch=='y');
}
}
}

