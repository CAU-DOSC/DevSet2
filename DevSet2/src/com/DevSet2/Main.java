package com.DevSet2;

import java.util.Scanner;

import com.DevSet2.structure.*;
import com.DevSet2.test.TestArr;


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
	    	maxval = 30;
	    	maxelems = 15;
	    	
	    	


	    	System.out.println("Bin Sort--------------------");
	    	IntSetBins bucket=new IntSetBins();
	    	bucket.intSetImp(maxelems,maxval);
	    	bucket.genSets();
	    	bucket.report();
	    	//bucket.printAll();  : if you want to print sorted result
	    	//bucket.printTime(); : if you want to print time info
	    	//bucket.getSpace();  : if you want to know space complexity
	    	System.out.println("---------Array---------");
			  IntSetArr arr = new IntSetArr();
			  TestArr arrTest = new TestArr();
			  arr.intSetImp(maxelems,maxval);
			  arr.arrayData();
			  int a[] = new int[15];
			  arr.report(a);
			  for(int i =0 ; i<15; i++)
				  System.out.println(a[i]);
			  System.out.println("size : "
				  + "" + arr.size());
			  //arrTest.testArr();

	    	
	    	//IntSetBitVec()
	    	System.out.println("Bit Vector ------------------");
	    	
	    	IntSetBitVec bitvec = new IntSetBitVec(maxval, maxelems);
	    	bitvec.test_print();

	    	
	 	    	
	    	//IntSetBST()
	    	System.out.println("---------BST---------");
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
			//System.out.println("------------------");
	    	//IntSetList lst = new IntSetList();
	    	//lst.intSetImp(maxelems, maxval);
	    	//lst.dataSet();
	    	//int b[] = new int[15];
	    	//bst.report(b);
	    	//for(int i =0 ; i<15; i++)
	    	//	System.out.println(b[i]);
	    	//System.out.println("size : "
	    	//		+ "" + lst.size());
	    	//
	    	//
	    	//System.out.println("------------------");

	
	}//main END
}
