package com.DevSet2;

import java.util.Scanner;

import com.DevSet2.structure.IntSetBST;
import com.DevSet2.structure.IntSetBins;
import com.DevSet2.structure.IntSetBitVec;

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
	    	
	    	
	    	//IntSetBins(源���寃�)
	    	//IntSetBins bucket=new IntSetBins();
	    	//bucket.intSetImp(maxelems,maxval);
	    	//bucket.genSets();
	    	//IntSetArr(理쒗쁽�깭)
	    	
	    	//IntSetBitVec(沅뚯쁺�꽑)
	    	System.out.println("Bit Vector ------------------");
	    	IntSetBitVec bitvec = new IntSetBitVec(64, 64);
	    	bitvec.insert(10);
	    	boolean bit = bitvec.test(10);
	    	System.out.println("bit : " + bit);
	    	
	    	int [] result = new int [100];
			bitvec.report(result);
	    	
	    	
	    	
	    	//IntSetBST(援ъ쁺�꽌)
	    	//System.out.println("------------------");
	    	//IntSetBST bst = new IntSetBST();
	    	//bst.intSetImp(maxelems, maxval);
	    	//bst.dataSet();
	    	//int v[] = new int[15];
	    	//bst.report(v);
	    	//for(int i =0 ; i<15; i++)
	    	//	System.out.println(v[i]);
	    	//System.out.println("size : "
	    		//	+ "" + bst.size());
	    	
	    	//IntSetList(源��궓�썒)
	    	
	    	
	    	System.out.println("------------------");

	
	}//main END
}
