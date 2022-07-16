class Node{
	int data;
	Node next;
}

class LinkedListImpl{
	Node head;
	public void insert(int a) {
		Node node = new Node();
		node.data= a;
		if(head==null) {
			head=node;
		}
		
		else {
		Node n =head;
		while(n.next!=null) {
			n = n.next;
		}
		n.next= node;
		}
	}
	
	public void show() {
		Node n = head;
		while(n.next!=null) {
			System.out.println(n.data);
			n= n.next;
		}
		System.out.println(n.data);
	}
	
	public void insertAtStart(int a){
		Node node = new Node();
		node.data = a;
		node.next = head;
		head= node;
		
	}
	
}
public class LinkedList {

	public static void main(String[] args) {
	LinkedListImpl obj = new LinkedListImpl();
	obj.insert(2);
	obj.insert(3);
	obj.insertAtStart(5);
	obj.show();
	
	
	}
	
	
}
