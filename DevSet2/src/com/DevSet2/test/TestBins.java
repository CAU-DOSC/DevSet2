package com.DevSet2.test;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;
import com.DevSet2.structure.IntSetBins;


public class TestBins {
	//maxval: n = 10^6
	//maxelems: m = n/100 , n/50, n/25
	
	//sort not duplicated integers, size is (m), and maximum value is (n-1)
	
	@Test
	public void testBins(){
		int maxvalue;
		int maxsize;
		
		Scanner s=new Scanner(System.in);
    	System.out.println("maxval?");
    	maxvalue=s.nextInt();
       
    	System.out.println("maxelems?");
    	Scanner s2=new Scanner(System.in);
    	maxsize=s2.nextInt();
		
    	s.close();
    	s2.close();
    	
		double start=System.currentTimeMillis();
		
    	IntSetBins binsort=new IntSetBins();
		binsort.intSetImp(maxsize, maxvalue);
		binsort.genSets();
		binsort.printAll();
		
		double end=System.currentTimeMillis();
		binsort.setTime(3, (end-start)/1000.0);
		
		//check time complexity
		System.out.println("--------TIME COMPLEXITY----------");
		binsort.printTime();
		
		//check space complexity
		System.out.println("-------SPACE COMPLEXITY---------");
		System.out.println(binsort.getSpace()); //size of biggest member variable
	}

}

