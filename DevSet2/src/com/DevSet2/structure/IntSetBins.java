package com.DevSet2.structure;
import java.util.*;

// KimEunGyeng

public class IntSetBins {
	private ArrayList<Integer> IntSetBins; // set of integers
	private int maxval;
	private int maxelems;
	private double time[];
	
	public IntSetBins(){
		//set time[]
		time = new double[4]; //initialize, insert, report, TOTAL
	}
	
	public void intSetImp(int maxelems, int maxval) {
		//initialize set as empty
		double start=System.currentTimeMillis();
		
		IntSetBins = new ArrayList<Integer>(maxelems);
		setMaxval(maxval);
		setMaxelems(maxelems);
		
		double end=System.currentTimeMillis();
		time[0] = (end - start)/1000.0;
	}
	
	public void genSets() {
		Random random = new Random();
		
		double start=System.currentTimeMillis();
		
		while(IntSetBins.size() < getMaxelems()) {
			insert(random.nextInt(getMaxval())); //random integer [0, maxval)
		}
		
		double end=System.currentTimeMillis();
		time[1] = (end-start)/1000.0;
		
		start=System.currentTimeMillis();
		report();
		end=System.currentTimeMillis();
		time[2] = (end-start)/1000.0;
	}
	
	public void insert(int element) {
		
		//check element is in set, then add
		if(!IntSetBins.contains(element)){
			IntSetBins.add(element);
		}
		
	}
	
	
	public int size() {
		//return the size of the current set
		return IntSetBins.size();
		
	}
	
	public void report() {
		//returns elements in sorted order
		ArrayList<Integer> bin = new ArrayList<Integer>();
		
		for(int i = 0; i < getMaxval() + 1; i++) {
			bin.add(0);
		}
		
		for(int i = 0; i < IntSetBins.size(); i++) {
			int bin_val = bin.get(IntSetBins.get(i));
			bin.set(IntSetBins.get(i), bin_val + 1);
		}
		
		int outPos = 0;
		for(int i = 0; i < bin.size(); i++) {
			for(int j = 0; j < bin.get(i); j++) {
				IntSetBins.set(outPos++, i);
			}
		}
		
	}
	
	public void printAll(){
		//print result of bin sorting
		for(int i = 0; i < IntSetBins.size() ; i++) {
			System.out.println(i+": "+IntSetBins.get(i));
		}
	}
	
	public void printTime(){
		//print time [initialize, insert, report, total]
		System.out.println("initialize: "+time[0]);
		System.out.println("(tot)insert: "+time[1]);
		System.out.println("report: "+time[2]);
		System.out.println("total: "+time[3]);
		
	}
	
	//getter and setter//////////////////////////////////
	public int getMaxval() {
		return this.maxval;
	}
	
	public void setMaxval(int new_val) {
		this.maxval = new_val;
	}
	
	public int getMaxelems() {
		return this.maxelems;
	}
	
	public void setMaxelems(int new_elems) {
		this.maxelems = new_elems;
	}
	
	public int getIntSetBins(int index){
		return IntSetBins.get(index);
	}
	
	public void setTime(int index, double time){
		this.time[index] = time;
	}
	
	public double getTime(int index){
		return time[index];
	}
	
	public int getSpace(){
		//return space complexity : size of member variable 'IntSetBins'
		return IntSetBins.size() * 4;
	}
	/////////////////////////////////////////////////////
 
}