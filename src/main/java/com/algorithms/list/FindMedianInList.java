package com.algorithms.list;

import java.util.ArrayList;
import java.util.Collections;

public class FindMedianInList {
	public float get(ArrayList<Integer> input){
		Collections.sort(input);
		int index=0;
		float median=0.0f;
		System.out.println("input.size() % 2 >>  " + input.size() % 2);
		if(( input.size() % 2) ==0){ // even 
			index  = ((input.size()/2) -1);
			 int nextIndex = index +1;
			  median =(float)(input.get(index) + input.get(nextIndex))/2;
			  System.out.println("median"+median);
		}else{//odd
			index = Math.round(input.size()/2);
			median= input.get(index);
		}
		return median;
		
	}
}
