import java.util.*;

class node{
	int data;
	node prev, next;
	node(int x){
		data = x;
	}                   
}

class list{
	node start, last;
	void insertfirst(int d){
		node newnode = new node(d);
		if(start==null)
			last = newnode;
		else
			start.prev = newnode;
		newnode.next = start;
		start = newnode;
	}
	void insertlast(int d){
		node newnode = new node(d);
		if(last==null)
			start = newnode;
		else
			last.next = newnode;
		newnode.prev = last;
		last = newnode;
	}
	void insert(int key, int d){
		node newnode = new node(d);
		node ptr = start;
		while(ptr!=null){
			if(ptr.data==key){
				if(ptr==last){
					newnode.next = null;
					last = newnode;
				}
				else{
					newnode.next = ptr.next;
					ptr.next.prev = newnode;
				}
				newnode.prev = ptr;
				ptr.next = newnode;
			}
			ptr = ptr.next;
		}
	}
	void deletefirst(){
		if(start==null){
			System.out.println("--- EMPTY LIST ---");
			return;
		}
		start = start.next;
		if(start!=null)
			start.prev = null;
		else
			last = null;
	}
	void deletelast(){
		if(last==null){
			System.out.println("--- EMPTY LIST ---");
			return;
		}
		last = last.prev;
		if(last!=null)
			last.next = null;
		else
			start = null;
	}
	void delete(int key){
		if(start==null){
			System.out.println("--- EMPTY LIST ---");
			return;
		}
		node ptr = start;
		while(ptr!=null){
			if(ptr.data==key){
				if(ptr.next!=null){
					ptr.next.prev = ptr.prev;
				}
				if(ptr.prev!=null){
					ptr.prev.next = ptr.next;
				}
			}
			ptr = ptr.next;
		}
	}
	void display(){
		if(start==null){
			System.out.println(" --- EMPTY LIST ---");
			return;
		}
		node ptr = start;
		while(ptr.next!=null){
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;	
		}
		System.out.println(ptr.data);
	}
	void displayrev(){
		if(start==null){
			System.out.println(" --- EMPTY LIST --- ");
			return;
		}
		node ptr = last;
		while(ptr.prev!=null){
			System.out.print(ptr.data + " -> ");
			ptr = ptr.prev;
		}
		System.out.println(ptr.data);
	}
}

class dll{
	public static void main(String[] args){
		int mo, key, n;
		list doubly = new list();
		Scanner inp = new Scanner(System.in);
		do{
			System.out.println("MENU:\n1. Insert first\n2. Insert last\n3. Insert after a key\n4. Delete first\n5. Delete last\n6. Delete a key\n7. Display\n8. Display reversed");
			System.out.print("Enter choice: ");
			mo = inp.nextInt();
			System.out.println(" ");
			switch(mo){
				case 1: System.out.println("Enter node value: ");
				              n = inp.nextInt();
				              doubly.insertfirst(n);
				              break;
				case 2: System.out.println("Enter node value: ");
				              n = inp.nextInt();
				              doubly.insertlast(n);
				              break;
				case 3: System.out.println("Enter key and node value: ");
				              key = inp.nextInt();
				              n = inp.nextInt();
				              doubly.insert(key, n);
				              break;
				case 4: doubly.deletefirst();
				              System.out.println("--- DELETED ---");
				              break;
				case 5: doubly.deletelast();
				              System.out.println("--- DELETED ---");
				              break;
				case 6: System.out.print("Enter key: ");
				              key = inp.nextInt();
				              doubly.delete(key);
				              break;
				case 7: doubly.display();
				              break;
				case 8: doubly.displayrev();
				              break;
			}
			System.out.println("\n");
		}while(mo>0 && mo<9);
	}
}