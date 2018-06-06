package com.BinSort.test;
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runners.JUnit4;

import com.BinSort.IntSetImp;

import junit.framework.Assert;

public class TestBinSort {
	//maxval: n = 10^8, 10^6
	//maxelems: m = n/100 , n/50, n/25
	
	//sort not duplicated integers, size is (m), and maximum value is (n-1) 
	@Test
	public void testBinSort(){
		int maxvalue;
		int maxsize;
		String time_exp[]={"initialize","insert","report","TOTAL"};
		
		double start=System.currentTimeMillis();
		Scanner s=new Scanner(System.in);
    	System.out.println("maxval?");
    	maxvalue=s.nextInt();
       
    	System.out.println("maxelems?");
    	Scanner s2=new Scanner(System.in);
    	maxsize=s2.nextInt();
		
    	s.close();
    	s2.close();
    	
		IntSetImp binsort=new IntSetImp();
		binsort.intSetImp(maxsize, maxvalue);
		binsort.genSets();
		double end=System.currentTimeMillis();
		binsort.setTime(3, (end-start)/1000.0);
		
		//check time complexity
		System.out.println("--------TIME COMPLEXITY----------");
		for(int i=0;i<4;i++){
			System.out.println(time_exp[i]+": "+binsort.getTime(i)+"s");
		}
		
		//check space complexity
		System.out.println("-------SPACE COMPLEXITY---------");
		int tot_space; //consider member variables in IntSetImp class
		tot_space= 4 + 4 + binsort.size() * 4; //two integer variables, and one ArrayList<Integer>
		System.out.println(tot_space);
	}

}
