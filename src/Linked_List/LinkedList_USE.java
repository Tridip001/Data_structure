package Linked_List;

public class LinkedList_USE {
	
	public static Node<Integer> Create_LinkedList(){
		
		Node<Integer>n1 = new Node<Integer>(10);
		Node<Integer>n2 = new Node<Integer>(20);
		Node<Integer>n3 = new Node<Integer>(30);
		Node<Integer>n4 = new Node<Integer>(40);
		Node<Integer>n5 = new Node<Integer>(56);
		
		n1.next = n2;
	//	System.out.println("n1:- "+n1+" data:- "+n1.data+" Next:- "+n1.next);
		n2.next = n3;
	//	System.out.println("n2:- "+n2+" data:- "+n2.data+" Next:- "+n2.next);
		n3.next = n4;
//		System.out.println("n3:- "+n3+" data:- "+n3.data+" Next:- "+n3.next);
//		System.out.println("n4:- "+n4+" data:- "+n4.data+" Next:- "+n4.next);
		n4.next  =n5;
		
		return n1;
		
	}
	public static void print(Node<Integer>head) {
		//System.out.println("Print:- "+head);
//		System.out.println(head.data);
//		System.out.println(head.next.data);
//		System.out.println(head.next.next.data);
		
		Node<Integer>temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("null");
	}
	public static void Increment(Node<Integer>head) {
		
		Node<Integer>temp = head;
		
		while(temp!=null) {
			temp.data+=100;
			temp = temp.next;
		}
		
	}
	public static int length(Node<Integer>head) {
		
		Node<Integer>temp = head;
		int count =0;
		
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static int get_element(Node<Integer>head,int i) {
		Node<Integer>temp = head;
		int count=0;
		
		while(temp!=null) {
			
			if(count==i && temp!=null) {
				
				return temp.data;
			}
			count++;
			temp= temp.next;
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		
//		Node<Integer>n1 = new Node<Integer>(10);
//		
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		
		Node<Integer>head = Create_LinkedList();
		//System.out.println("Main:- "+head);
		Increment(head);
		print(head);
		System.out.println();
		System.out.println("Length:- "+length(head));
		System.out.println(get_element(head, 4));
		
	}
}
