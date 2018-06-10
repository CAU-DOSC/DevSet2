package com.DevSet2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.DevSet2.structure.IntSetBins;

public class TestBins_func {
	
	@Test
	public void test_genSets() {
		
		IntSetBins bs = new IntSetBins();
		bs.intSetImp(11, 11); //maxsize=11, maxvalue=11
		bs.genSets();
		
		//check maxsize, maxval
		assertEquals(bs.getMaxelems(), 11);
		assertEquals(bs.getMaxval(), 11);
		
		
		//check result: result must be '0,1,2,....,10'
		for(int i = 0; i < 11; i++) {
			assertEquals(bs.getIntSetBins(i), i);
		}
	}

}
