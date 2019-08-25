         import java.util.*;

class node{
	int data;
	node next;
	node(int x){ 
		data = x; 
	}
}

class link{
	node start;
	void insert(int d){
		node newnode = new node(d);
		newnode.next = start;
		start = newnode;
	}
	void insert(int key, int d){
		node newnode = new node(d);
		node ptr = start;
		while(ptr!=null){
			if(ptr.data == key){
				newnode.next = ptr.next;
				ptr.next = newnode;
				return;
			}
			ptr = ptr.next;
		}
	}
	void insertlast(int d){
		node newnode = new node(d);
		if(start==null){
			start = newnode;
			return;
		}
		node ptr=start;
		while(ptr.next!=null)
			ptr=ptr.next;
		ptr.next = newnode;
	}
	void display(){
		node ptr = start;
		System.out.print("List data: ");
		while(ptr != null){
			if(ptr.next!=null)
				System.out.print(ptr.data+" -> ");
			else
				System.out.print(ptr.data);
			ptr = ptr.next;
		}
	}
	void delete(){
		if(start!=null){
			start = start.next;
			System.out.println("DELETED ELEMENT");
		}
		else
			System.out.println("-- Empty list --");
	}
	void delete(int nodedata){
		if(start.data == nodedata){
			start = start.next;
			return;
		}
		node ptr = start;
		while(ptr.next!=null){
			if(ptr.next.data == nodedata){
				ptr.next = ptr.next.next;	
				return;
			}
			ptr = ptr.next;
		}
	}
}

class linkedlist{
	public static void main(String args[]){
		int opt, data;
		Scanner inp = new Scanner(System.in);
		link list = new link();
		do{
			System.out.print("\n\n1.Insert at beginning\n2.Insert after a key\n3.Delete at beginning\n4.Delete a specific element\n5.Display\n6.Insert last\n7.Exit");
			System.out.print("\nEnter option: ");
			opt = inp.nextInt();

			switch(opt){
				case 1: System.out.print("Enter node value: ");
					data = inp.nextInt();
					list.insert(data);
					break;
				case 2: System.out.print("Enter key and newnode value: ");
					int key = inp.nextInt();
					data = inp.nextInt();
					list.insert(key, data);
					break;
				case 3: list.delete();
					break;		
				case 4: System.out.print("Enter value of node to delete: ");
					data = inp.nextInt();
					list.delete(data);
					break; 
				case 5: list.display();
					break;
				case 6: System.out.print("Enter node value: ");
					data = inp.nextInt();
					list.insertlast(data);
					break;
			}
		}while(opt!=7);	
	}
}