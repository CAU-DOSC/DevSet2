package com.DevSet2;

import java.util.Scanner;

import com.DevSet2.structure.*;


public class Main {
	public static void main(String[] args) {
	    	
	    	int maxval;
	    	int maxelems;
	    	
//	    	System.out.println("maxval?");
//	    	Scanner _maxval=new Scanner(System.in);
//	    	maxval= _maxval.nextInt();
//	    	
//	    	System.out.println("maxelems?");
//	    	Scanner   _maxelems= new Scanner(System.in);
//	    	maxelems= _maxelems.nextInt();
//	    	
//	    	_maxval.close();
//	    	_maxelems.close();
	    	maxval = 30;
	    	maxelems = 15;
	    	
	    	/*
	    	 
	    	//IntSetBins()
	    	//IntSetBins bucket=new IntSetBins();
	    	//bucket.intSetImp(maxelems,maxval);
	    	//bucket.genSets();
	    	//IntSetArr()
	    	
	    	//IntSetBitVec()
	    	System.out.println("Bit Vector ------------------");
	    	IntSetBitVec bitvec = new IntSetBitVec(64, 64);
	    	bitvec.insert(10);
	    	boolean bit = bitvec.test(10);
	    	System.out.println("bit : " + bit);
	    	
	    	int [] result = new int [100];
			bitvec.report(result);
	    	
	    	*/
	    	
	    	//IntSetBST()
	    	System.out.println("IntSetBST()");
	    	IntSetBST bst = new IntSetBST();
	    	bst.intSetImp(maxelems, maxval);
	    	bst.dataSet();
	    	int v[] = new int[15];
	    	bst.report(v);
	    	for(int i =0 ; i<15; i++)
	    		System.out.println(v[i]);
	    	System.out.println("size : "
	    		+ "" + bst.size());
	    	
	    	//IntSetList()
	    	System.out.println("IntSetList()");
	    	IntSetList lst = new IntSetList();
	    	lst.intSetImp(maxelems, maxval);
	    	
	    	int q[] = new int[15];
	    	lst.report(q);
	    	for(int i =0 ; i<15; i++)
	    		System.out.println(q[i]);
	    	System.out.println("size : "
	    			+ "" + lst.size());
	    	
	    	
	    	System.out.println("------------------");

	
	}//main END
}
