# DevSet2
+ 소스코드 DevSet2/src/com/DevSet2/structure
+ 테스트 DevSet2/DevSet2/src/com/DevSet2/test

## BST 결과 분석 (구영서)
* Time & Space Complexity (maxval=10^6)
1. maxelem=10000
+ initialize: 0.0s
+ insert: 0.126s
+ report: 0.001s
+ TOTAL: 0.128s

Space Complexity
+ 가용한 힙 메모리126892384bytes
+ 객체 생성 후 가용한 힙 메모리126892384bytes
+ 객체 하나의 메모리 크기는 0bytes

2. maxelem=20000
+ initialize: 0.0s
+ insert: 0.317s
+ report: 0.001s
+ TOTAL: 0.319s

Space Complexity
+ 가용한 힙 메모리126892392bytes
+ 객체 생성 후 가용한 힙 메모리126210792bytes
+ 객체 하나의 메모리 크기는 34bytes

3. maxelem=40000
+ initialize: 0.0s
+ insert: 1.076s
+ report: 0.002s
+ TOTAL: 1.08s

Space Complexity
+ 가용한 힙 메모리126892544bytes
+ 객체 생성 후 가용한 힙 메모리125529344bytes
+ 객체 하나의 메모리 크기는 34bytes

4. maxelem=250000
+ initialize: 0.0s
+ insert: 102.508s
+ report: 0.019s
+ TOTAL: 102.528s

Space Complexity
+ 가용한 힙 메모리126892656bytes
+ 객체 생성 후 가용한 힙 메모리118395040bytes
+ 객체 하나의 메모리 크기는 33bytes


## Array 결과 분석 (최현태)
* Time & Space Complexity (maxval=10^6)
1. maxelem=10000
+ initialize: 0.0s
+ insert: 0.0391s
+ report: 0.016s
+ total(including I/0): 0.407s
+ space complexity (biggest member variable): 아직 test X

2. maxelem=20000
+ initialize: 0.0s
+ insert: 0.875s
+ report: 0.0s
+ total(including I/O): 5.89s
+ space complexity (biggest member variable): 아직 test X

3. maxelem=40000
+ initialize: 0.0s
+ insert: 3.235s
+ report: 0.0s
+ total(including I/O): 3.235s
+ space complexity (biggest member variable): 아직 test X


## BinSort 결과 분석 (김은경)
* Time & Space Complexity (maxval=10^6)
1. maxelem=10000
+ initialize: 0.0s
+ insert: 0.068s
+ report: 0.031s
+ total(including I/0): 5.739s
+ space complexity (biggest member variable): 40000

2. maxelem=20000
+ initialize: 0.0s
+ insert: 0.242s
+ report: 0.032s
+ total(including I/O): 5.999s
+ space complexity (biggest member variable): 80000

3. maxelem=40000
+ initialize: 0.0s
+ insert: 0.992s
+ report: 0.038s
+ total(including I/O): 6.358s
+ space complexity (biggest member variable): 160000

## simpleist 결과 분석 (김남웅)
* Time & Space Complexity (maxval=10^6)
1. maxelem=10000
+ initialize: 0.005s
+ insert: 0.808s
+ report: 0.002s
+ total(including I/0): 0.814s
+ space complexity (biggest member variable): x

2. maxelem=20000
+ initialize: 0.006s
+ insert: 3.708s
+ report: 0.001s
+ total(including I/O): 3.719s
+ space complexity (biggest member variable): x

3. maxelem=40000
+ initialize: 0.005s
+ insert: 12.506s
+ report: 0.003s
+ total(including I/O): 12.517s
+ space complexity (biggest member variable): x

## Bit Vector 결과 분석 (권영선)
* Time & Space Complexity (maxval=10^6)
1. maxelem=10000
+ initialize: 0.013s
+ insert: 0.008s
+ report: 0.01s
+ total(including I/0): 0.034s
+ space complexity (Used Memory) : 6bytes

2. maxelem=20000
+ initialize: 0.015s
+ insert: 0.004s
+ report: 0.013s
+ total(including I/O): 0.033s
+ space complexity (Used Memory) : 6bytes

3. maxelem=40000
+ initialize: 0.016s
+ insert: 0.006s
+ report: 0.01s
+ total(including I/O): 0.033s
+ space complexity (Used Memory) : 6bytes

* Time & Space Complexity (maxval=10^8)
1. maxelem=1000000
+ initialize: 0.21s
+ insert: 0.087s
+ report: 0.161s
+ total(including I/0): 0.46s
+ space complexity (Used Memory) : 22bytes

2. maxelem=2000000
+ initialize: 0.234s
+ insert: 0.15s
+ report: 0.181s
+ total(including I/O): 0.566s
+ space complexity (Used Memory) : 26bytes

3. maxelem=4000000
+ initialize: 0.215s
+ insert: 0.301s
+ report: 0.203s
+ total(including I/O): 0.72s
+ space complexity (Used Memory) : 34bytes
