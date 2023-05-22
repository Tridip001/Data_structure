package Linked_List;

import java.util.Scanner;

public class LinkedList_USE2 {
	// this function time complexcity is very bed :-O(n^2);
	public static Node2<Integer>taking_input(){
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node2<Integer>head = null,tail=null;
		
		
		while(data!=-1) {
			Node2<Integer>current_node = new Node2<Integer>(data);
			
			if(head==null) {
				head = current_node;
				tail = current_node;
			}
			else {
//				Node2<Integer>tail = head;
//				while(tail.next!=null) {
//					tail= tail.next;
//				}
				tail.next = current_node;
				tail = current_node;           // this method take time O(n): so it is better:
			}
			data = sc.nextInt();
		}
		return head;
	}
	public static Node2<Integer>  insert(Node2<Integer>head,int data, int pos) {
		
		Node2<Integer>New_Node = new Node2<Integer>(data);
		
		if(pos==0) {
			New_Node.next = head;
			//head = New_Node;
			return New_Node;
		}
		else {
		int count =0;
		Node2<Integer>prev = head;
		
		while (count<pos-1 && prev!=null) {
			count++;
			prev = prev.next;
		}
		if(prev!=null) {
		New_Node.next = prev.next;
		prev.next = New_Node;
		}
		return head;
		}	
		
	}
	public static Node2<Integer>Delete(Node2<Integer>head,int pos){
		
		if(pos==0) {
			
			head = head.next;
			return head;
		}
		else {
		    
			Node2<Integer>temp = head;
			int count =0;
			
			while(count<pos-1 && temp.next!=null) {
				count++;
				temp= temp.next;
			}
			
			if(temp.next!=null) {
				
				temp.next = temp.next.next;
				
			}
			
		}
	    return head;
	}
	public static void print(Node2<Integer>head) {
		
		Node2<Integer>temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static Node2<Integer> Mid_Node(Node2<Integer>head){
		
		if(head==null|| head.next==null) {
			return head;
		}
		
		Node2<Integer>slow = head;
		Node2<Integer>fast = head;
		
		while(fast.next!=null && fast.next.next!=null) {
			
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		
		Node2<Integer>head = taking_input();
	     head  = insert(head, 80, 1);
		print(head);
		head = Delete(head, 3);
		print(head);
		
		System.out.println("Mid element of LinkedList:- ");
		Node2<Integer>mid = Mid_Node(head);
		System.out.println(mid.data);
 		
	}
}
