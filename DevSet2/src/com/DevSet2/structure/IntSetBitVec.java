package com.DevSet2.structure;
import java.util.*;

public class IntSetBitVec {
	
	private static final int BITSPERWORD = 32;
	private static final int SHIFT = 5;
	private static final int MASK = 0x1F; // 0001 1111
	private int n, hi, maxelems;
	private int [] x;
	
	public void set(int i) {
		x[i>>SHIFT] |= (1<<(i & MASK));
	}
	
	public void clr(int i) {
		x[i>>SHIFT] &= ~(1<<(i & MASK));
	}
	
	public boolean test(int i) {
		if ((x[i>>SHIFT] & (1<<(i & MASK))) == 1) return true;
		return false;
	}
	
	//maxval : maximum value of any element.
	//maxelems : maximum number of elements.
	
	public IntSetBitVec(int maxelems, int maxval) {
		hi = maxval;
		x = new int [1 + (hi / BITSPERWORD)];
		
		for (int i = 0; i < hi; i++) {
			clr(i);
		}
		
		n = 0;
		this.maxelems = maxelems;
	}
	
	public void insert(int element) {
		if(test(element)) {
			return;
		}
		else {
			set(element);
			n++;
		}
	}
	
	
	public int size() {
		return n;
	}
	
	public void report(int [] v) {
		int j = 0;
		
		for (int i = 0; i < hi; i++) {
			if (test(i)) {
				v[j++] = i;
			}
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(i + " : " + v[i]);
		}
	}
	
	public void print() {
		int [] result = new int [hi];
		report(result);
		//for (int i = 0; i < result.length; i++) {
		//	System.out.println(i + " : " + result[i]);
		//}
	}
 
}