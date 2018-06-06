package com.BinSort;
import java.util.*;
 
public class IntSetImp {
	private ArrayList<Integer> IntSetBins; // set of integers
	private int maxval;
	private int maxelems;
	private double time[];
	
	public IntSetImp(){
		//set time[]
		time = new double[4];
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
			
		for(int i = 0; i < IntSetBins.size() ; i++) {
			System.out.println(i+": "+IntSetBins.get(i));
		}
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
	/////////////////////////////////////////////////////
 
 
 
 
    public static void main(String[] args) {
    	
    	int maxval;
    	int maxelems;
    	
    	Scanner s=new Scanner(System.in);
    	System.out.println("maxval?");
    	maxval=s.nextInt();
    	
    	System.out.println("maxelems?");
    	Scanner s2=new Scanner(System.in);
    	maxelems=s2.nextInt();
    	s2.close();
    	System.out.println("------------------");
    	
    	s.close();
    	s2.close();
    	
    	IntSetImp bucket=new IntSetImp();
    	bucket.intSetImp(maxelems,maxval);
    	bucket.genSets();
    	
    	System.out.println("------------------");
       
    }//main END
}