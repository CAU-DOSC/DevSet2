package com.DevSet2;

import java.util.Scanner;

import com.DevSet2.structure.IntSetBST;
import com.DevSet2.structure.IntSetBins;

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
	    	
	    	System.out.println("------------------");
	    	//IntSetBins(김은경)
	    	//IntSetBins bucket=new IntSetBins();
	    	//bucket.intSetImp(maxelems,maxval);
	    	//bucket.genSets();
	    	//IntSetArr(최현태)
	    	
	    	//IntSetBitVec(권영선)
	    	
	    	//IntSetBST(구영서)
	    	IntSetBST bst = new IntSetBST();
	    	bst.intSetImp(maxelems, maxval);
	    	bst.dataSet();
	    	int v[] = new int[15];
	    	bst.report(v);
	    	for(int i =0 ; i<15; i++)
	    		System.out.println(v[i]);
	    	System.out.println("size : "
	    			+ "" + bst.size());
	    	
	    	//IntSetList(김남웅)
	    	
	    	
	    	System.out.println("------------------");

	
	}//main END
}
