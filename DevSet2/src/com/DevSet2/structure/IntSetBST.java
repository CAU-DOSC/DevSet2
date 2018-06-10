package com.DevSet2.structure;
import java.util.*;

// 구영서

public class IntSetBST {
	// 트리 구조의 노드 클래스 생
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
	

	public void intSetImp(int maxelems, int maxval) {
		//초기
		this.root = null;
		this.maxval = maxval;
		this.maxelems = maxelems;
	}
	
	public void dataSet() {
		//data들 maxelems 만큼 maxval 범위안의 숫자들을 랜덤으로 뽑아서 insert.
		Random random = new Random();
		while(size() < this.maxelems) {
			insert(random.nextInt(this.maxval));
		}	
	}
	
	public void insert(int element) {
		//받아온 값을 Node로 만든다.
		Node newNode = new Node(element);
		// root가 비어있으면 tree가 모두 비어있기 때문에 root부터 채운다.
		if(root==null){
			root = newNode;
			root.size++;
			return;
		}
		Node cur = root;
		Node prev_cur = null;
		// 재귀적으로 하지 않고 root부터 탐색하여서 비어있는 부분에 추가시킨다.
		while(true){
			prev_cur = cur;
			if(element<cur.element){		// 노드의 값보다 받아온 값의 크기가 작다면 		
				cur = cur.left;
				if(cur==null){
					prev_cur.left = newNode;
					root.size++;
					return;
				}
			}else{							// 노드의 값보다 받아온 값의 크기가 크다면 	
				cur = cur.right;
				if(cur==null){
					prev_cur.right = newNode;
					root.size++;
					return;
				}
			}
		}
	}
	private void explore(int v[], Node node) {	// report를 하기 위하여 탐색하여서 v 배열에 차례대로 쌓는다.
		if(node == null)
			return;
		explore(v,node.left);					// 왼편이 중심보다 작은 값이 들어가기 때문에 순서대로 담기위하여 왼쪽부터 탐
		v[this.explore_count++] = node.element;
		explore(v,node.right);
	}

	public int size() {
		return root == null ? 0 : root.size;	// root가 비어있다면 그 tree의 size는 0이기 때문에 0을 반환한다.
	}
	
	public void report(int v[]) {
		this.explore_count = 0;					// v의 index을 count하기 위하여 0으로 초기화한다.
		explore(v,root);
	}


 
}

