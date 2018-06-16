package com.DevSet2.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;
import com.DevSet2.structure.IntSetBitVec;

public class TestBitVec {

	@Test
	public void testBitVec() {
		int maxvalue, maxelems;
		long start, end, total_start;
		
		int mb = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime();
		
		//Time elapsed
		//Initialize
		maxvalue = 1000000;
		maxelems = maxvalue / 100;
		
		total_start = System.currentTimeMillis();
		start = System.currentTimeMillis();
		
		
		IntSetBitVec x = new IntSetBitVec(maxvalue, maxelems);
		
		end = System.currentTimeMillis();
		System.out.println("Initialize : " + (end - start)/1000.0 + "sec");
		
		//Insert
		start = System.currentTimeMillis();
		
		Random random = new Random();
		while(x.size() < maxelems) {
			x.insert(random.nextInt(maxvalue));
		}
		
		end = System.currentTimeMillis();
		System.out.println("Insert : " + (end - start)/1000.0 + "sec");
		
		//Insert
		start = System.currentTimeMillis();
		
		int [] v = new int[maxelems];
		x.report(v);
		
		end = System.currentTimeMillis();
		System.out.println("Report : " + (end - start)/1000.0 + "sec");
		
		//Total
		System.out.println("Total : " + (end - total_start)/1000.0 + "sec");
		
		//Space
		System.out.println("Used Memory : " + (runtime.totalMemory() - runtime.freeMemory()) / mb);
	}

}
