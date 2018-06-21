
package com.DevSet2.structure;
import java.util.*;
// 최현태
 
public class IntSetArr {
	private int maxval;
	private int maxelems;
	private int[] array = new int[0];
	public IntSetArr(){

	}
	
	public void intSetImp(int maxelems, int maxval) {
		this.maxelems = maxelems;
		this.maxval = maxval;
	}

	public void arrayData(){
		int randomCheck[]= new int[maxelems];
		Arrays.fill(randomCheck,-1);
		int j = 0;
		Random random = new Random();
		while(size()<maxelems){
			int randomValue = random.nextInt(this.maxval);
			for(int i = 0; i< maxelems;i++){
				if(randomValue == randomCheck[i]){
					randomValue = random.nextInt(this.maxval);
					i = -1;
				}
			}
			randomCheck[j++] = randomValue;
			insert(randomValue);
		}
	}
	
	public void insert(int element) {
		int originalSize = size();

		// 한 칸 늘어난 임시 배열 생성
		int temp[] = new int[originalSize+1];
		// 배열 -1로 초기화
		Arrays.fill(temp,-1);
		System.arraycopy(array,0,temp,0,originalSize);

		// 삽입하려는 element가 배열 index element보다 작아지면 뒤로 한칸 씩 밀고 삽입
		// 삽입하려는 element가 배열 index element보다 크면 다음 index로
		for(int index=0; index<originalSize+1; index++){
			// -1 만나면 바로 삽입
			if(temp[index] == -1){
				temp[index] = element;
				break;
			}
			else{
				if(temp[index]>element){
					int tempIndex = originalSize;
					for(int tempValue=originalSize-1; tempValue>=index; tempValue--){
						temp[tempIndex--] = temp[tempValue];
					}
					temp[index] = element;
					break;
				}
			}
		}
		array = temp;
	}
	
	
	public int size() {
		return array.length;
	}
	
	public void report(int v[]) {
		System.arraycopy(array,0,v,0,array.length);
	}
 
}