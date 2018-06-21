package com.DevSet2.structure;

import java.util.*;

public class IntSetBitVec {
	private final int SHIFT = 3;
	private static final int MASK = 0x07; // 0000 0111
	private int size;
	private byte [] x;
	private int n, hi, maxelems;
	
	//maxval : maximum value of any element.
	//maxelems : maximum number of elements.
	
	public IntSetBitVec(int maxval, int maxelems) {
		this.hi = maxval;
		this.maxelems = maxelems;
		x = new byte [(maxval >> SHIFT) + 1];
		this.size = x.length * 8;
		
		for (int i = 0; i < size; i++) {
			this.clr(i);
		}
		System.out.println("Maximum BitVector size : " + this.size);
	}
	
	public void clr(int i) {
		int offset = i >> SHIFT;
		byte tmp = (byte)(1 << (i & MASK));
		
		x[offset] &= ~tmp;
	}
	
	public void set(int i) {
		int offset = i >> SHIFT;
		byte tmp = (byte)(1 << (i & MASK));
		
		x[offset] |= tmp;
	}
	
	public boolean test(int i) {
		int offset = i >> SHIFT;
		int result = x[offset] & (1 << (i & MASK));
		
		if (result > 0) return true;
		else return false;
	}
	
	public void insert(int element) {
		if(element > hi) {
			return;
		}
		
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
		
		for (int i = 0; i < size; i++) {
			if (test(i)) {
				v[j++] = i;
			}
		}
		
	}
	
	public void test_print() {
		int [] result = new int [maxelems];
		
		Random random = new Random();
		while(size() < maxelems) {
			insert(random.nextInt(hi));
		}
		
		report(result);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println("size : " + size());
	}
	
}
