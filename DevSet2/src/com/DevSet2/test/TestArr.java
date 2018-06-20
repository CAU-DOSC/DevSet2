package com.DevSet2.test;

import static org.junit.Assert.*;
import com.DevSet2.structure.IntSetArr;
import java.util.Scanner;

import com.DevSet2.structure.IntSetBST;
import org.junit.Test;

public class TestArr {

	@Test
	public void testArr() {
		int maxvalue;
		int maxelems;
		double start,total_start;
		double end;
		String time_exp[]={"initialize","insert","report","TOTAL"};

		Scanner s=new Scanner(System.in);
		System.out.println("maxval?");
		maxvalue=s.nextInt();

		System.out.println("maxelems?");
		Scanner s2=new Scanner(System.in);
		maxelems=s2.nextInt();

		s.close();
		s2.close();

		System.gc();
		Runtime r = Runtime.getRuntime();

		total_start=System.currentTimeMillis();

		IntSetArr arr = new IntSetArr();
		//check time complexity
		System.out.println("--------TIME COMPLEXITY----------");

		//initialize
		start=System.currentTimeMillis();
		arr.intSetImp(maxelems, maxvalue);
		end=System.currentTimeMillis();
		System.out.println(time_exp[0]+": "+(end - start)/1000.0+"s");

		//insert
		start=System.currentTimeMillis();
		long firstMemorySize = r.freeMemory();
		arr.arrayData();
		long lastMemorySize = r.freeMemory();
		end=System.currentTimeMillis();
		System.out.println(time_exp[1]+": "+(end - start)/1000.0+"s");

		//report
		start=System.currentTimeMillis();
		int v[] = new int[maxelems];
		arr.report(v);
		end=System.currentTimeMillis();
		System.out.println(time_exp[2]+": "+(end - start)/1000.0+"s");

		//TOTAL
		end=System.currentTimeMillis();
		System.out.println(time_exp[3]+": "+(end - total_start)/1000.0+"s");


		System.out.println("가용한 힙 메모리" + firstMemorySize  + "bytes");
		System.out.println("객체 생성 후 가용한 힙 메모리" + lastMemorySize  + "bytes");
		System.out.println("객체 하나의 메모리 크기는 " + (firstMemorySize - lastMemorySize)/maxelems + "bytes");
	}

}
