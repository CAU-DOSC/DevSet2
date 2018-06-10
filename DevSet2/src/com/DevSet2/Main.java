package com.DevSet2;

import java.util.Scanner;

import com.DevSet2.structure.IntSetBins;

public class Main {
	public static void main(String[] args) {
	    	
	    	int maxval;
	    	int maxelems;
	    	
	    	System.out.println("maxval?");
	    	Scanner _maxval=new Scanner(System.in);
	    	maxval= _maxval.nextInt();
	    	
	    	System.out.println("maxelems?");
	    	Scanner   _maxelems= new Scanner(System.in);
	    	maxelems= _maxelems.nextInt();
	    	
	    	_maxval.close();
	    	_maxelems.close();
	    	
	    	System.out.println("------------------");
	    	//IntSetBins(김은경)
	    	IntSetBins bucket=new IntSetBins();
	    	bucket.intSetImp(maxelems,maxval);
	    	bucket.genSets();
	    	//IntSetArr(최현태)
	    	
	    	//IntSetBitVec(권영선)
	    	
	    	//IntSetBST(구영서)
	    	
	    	//IntSetList(김남웅)
	    	
	    	
	    	System.out.println("------------------");

	
	}//main END
}
