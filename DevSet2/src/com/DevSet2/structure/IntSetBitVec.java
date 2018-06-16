package com.DevSet2.structure;

import java.util.*;

public class IntSetBitVec {
	private Vector<Boolean> bitvec;
	private int maxval, maxelems;
	private int size;
	
	public IntSetBitVec(int maxval, int maxelems) {
		bitvec = new Vector<Boolean>();
		this.maxval = maxval;
		this.maxelems = maxelems;
		this.size = 0;
		
		for (int i = 0; i <= maxval; i++) {
			bitvec.add(i, false);
		}
	}
	
	public void insert(int element) {
		if ((size >= maxelems) | (element > maxval)) {
			return;
		}
		if(bitvec.get(element)) {
			return;
		} 
		else {
			bitvec.remove(element);
			bitvec.add(element, true);
			size++;
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public void report(int [] v) {
		int j = 0;
		for(int i = 0; i <= maxval; i++) {
			if(bitvec.get(i)) {
				v[j++] = i;
			}
		}
		
		//for(int i = 0; i < v.length; i++) {
			//System.out.println("element >>> " + v[i]);
		//}
	}
	
}
