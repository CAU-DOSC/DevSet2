package com.DevSet2.structure;
import java.util.*;
 
// 구영서

public class IntSetBST {
	
	class Node{
		int element;
		Node left;
		Node right;	
		int size;
		public Node(int data){
			element = data;
			size = 0;
			left = null;
			right = null;
		}
	}

	private int maxval;
	private int maxelems;
	private int explore_count;
	private Node root;
	
	public IntSetBST(){
		
	}
	
	public void intSetImp(int maxelems, int maxval) {
		//initialize set as empty
		//double start=System.currentTimeMillis();
		this.root = null;
		this.maxval = maxval;
		this.maxelems = maxelems;
//		double end=System.currentTimeMillis();
//		time[0] = (end - start)/1000.0;
	}
	
	public void dataSet() {
		Random random = new Random();
		
		while(size() < this.maxelems) {
			insert(random.nextInt(this.maxval));
		}	
	}
	
	public void insert(int element) {
		Node newNode = new Node(element);
		if(root==null){
			root = newNode;
			root.size++;
			return;
		}
		Node cur = root;
		Node prev_cur = null;
		while(true){
			prev_cur = cur;
			if(element<cur.element){				
				cur = cur.left;
				if(cur==null){
					prev_cur.left = newNode;
					root.size++;
					return;
				}
			}else{
				cur = cur.right;
				if(cur==null){
					prev_cur.right = newNode;
					root.size++;
					return;
				}
			}
		}
	}
	private void explore(int v[], Node node) {
		if(node == null)
			return;
		
		explore(v,node.left);
		v[this.explore_count++] = node.element;
		explore(v,node.right);
	}

	public int size() {
		return root == null ? 0 : root.size;
	}
	
	public void report(int v[]) {
		this.explore_count = 0;
		explore(v,root);
	}


 
}