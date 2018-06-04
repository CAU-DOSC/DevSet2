
## 과제2:  개발 / 실행 / 분석
+ 5(4)명이 1 team으로 작업
  + 조장(1) , 조원(나머지)
  + 각조에 대하여 조장이 maintainer인 repository  DevSetN부여
    + DevSet2, DevSet2, … DevSet9
    + DevSet1 repository 에 guide 등 관련 내용 posting
    + Repository DevSetN 은 조장(maintainer)만  push 할 수 있음
    + 조원은 maintainer에게 PR을 통하여 push  가능
  + 각 repository에는 다음의 file 들이 생성되어야 함
    + README. md : 과제진행에 대한 설명, 역할분담 등등
    + FINAL.md : 과제 결과 분석에 대한 내용 기록(진행과정 포함)
    +Source files
+ Works to do
  + Implementation of each code
	+ Unit test for implementations
	  + Periodic(or continuous) build and smoke test
	+ Performance tuning
	+ Due to June 21st
+ 수행방법은 조별로 협의를 통하여 결정하여 실행
	+ 모든 조원이 아래 각 부문에 역할이 정의되고 실행되어야 함
	  + Implementation of code(unit test를 포함하여)
	  + Performance 측정을 통한 분석 및 개선

## Problem: SET Implementation
+ A sorted sequence of m random integers in [0, maxval), without duplicates
	+ SET implementation of ‘maxval’ elements
+ Same interfaces with different implementation of 5 data structures
	+ Arrays
	+ Simple lists
	+ Binary search tree(list)
	+ Bit vectors
	+ Bins (buckets)
+ Experiments 5 implementation with proper ‘maxval’ and ‘m’ values
	+ Time complexity – elapsed time to create m-elements set
	+ Space complexity – spaces required to create same set
+ Refine implementation to get reasonable performance result
	+ Performance rank in terms of TIME and SPACE

## Interface
+ IntSet as set of integers
	+ IntSetxxx: xxx as a qualifier
	+ IntSetArr, IntSetList, IntSetBST, IntSetBitVec, IntSetBins
	
+ intSetImp(int maxelems, int maxval) 
	+ initializes the set to empty
	+ maxelems: maximum number of elements
	+ maxval: maximum value of any element
+ insert(int element)
	 + adds a new integer to the set, if it is not already present
+ size() 
	 + tells the current number of elements
+ report(int *v) 
	 + returns elements in sorted order

## A C++ code
+ An example code to generate a sorted set of random integers 

void gensets(int m, int maxval)

{ 	int *v = new int[m];

	  IntSetImp S(m, maxval);
    
	  while (S.size() < m)
    
		    S.insert(bigrand() % maxval);
        
	  S.report(v);
    
    for (int i = 0; i < m; i++)
    
	  cout << v[i] << "\n";
    
}


## Performance tuning
+ maxval = n = 〖10〗^8 , 〖10〗^6
+ maxelements: m = n/100, n/50, n/25

+ Set generation experiments measured for 5 cases excluding i/o
	+ Time elapsed
	  + initialize / insert / report / Total
	+ Total space required
	  + for SET implementation
    
+ Improve performance
	+ Implementation and measure
	+ Performance upgrade iterations

## EX: code for bit vector

class IntSetBitVec {

private:

  enum { BITSPERWORD = 32, SHIFT = 5, MASK = 0x1F };

  int n, hi, *x;

  void set(int i) {        x[i>>SHIFT] |=  (1<<(i & MASK)); }

  void clr(int i) {        x[i>>SHIFT] &= ~(1<<(i & MASK)); }

  int test(int i) { return x[i>>SHIFT] &   (i<<(i & MASK)); }

public:

  IntSetBitVec(maxelements, maxval)

  {	hi = maxval;

	  x = new int[1 + hi/BITSPERWORD];
  
	  for (int i = 0; i < hi; i++)
  
		  clr(i);
    
	   n = 0;
  
  }

int size() { return n; }

void insert(t)

{	if (test(t))

		return;
    
	set(t);
  
	n++;
  
}

void report(int *v)

{	j = 0

	for (int i = 0; i < hi; i++)
  
		if test(i)
    
			v[j++] = i
      
}

};

