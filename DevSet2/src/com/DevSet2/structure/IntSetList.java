package com.DevSet2.structure;
import java.util.*;

// 김남웅

public class IntSetList {
	private int maxval;
	private int maxelems;
	class Node{
		int element;
		Node next;	
	
		public Node(int data){
			element = data;
			next = null;
			
		}
	}
	private Node head;
	private int size;


	
	public IntSetList(){
		this.head=new Node(-1);
		size=0;
	}
	
	public void intSetImp(int maxelems, int maxval) {
		
		this.maxval=maxval;
		this.maxelems=maxelems;
		Random random = new Random();
		while(size() < this.maxelems) {
			insert(random.nextInt(this.maxval));
		}	
	}
	
	public void insert(int element) {
		//오름차순으로 입력
		this.size=this.size+1;
		Node temp=new Node(element);
		Node now=this.head;
		
		while(now.next!=null)
		{

			if(now.next.element<=temp.element)
			{
				now=now.next;
			}    
			else
			{
				temp.next=now.next;
				now.next=temp;
				return;
			}

		}

		now.next=temp;
		return;
		
	}
	
	
	public int size() {
		return this.size;
	}
	
	public void report(int[] v) {
		Node now=this.head;
		int index=0;
		while(now.next!=null)
		{
			v[index++]=now.next.element;
			now=now.next;
		}
	
	}
 
}
