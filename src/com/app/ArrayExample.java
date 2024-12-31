package com.app;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3};
		int newElement=4;
		
		
		
		System.out.println(Arrays.toString(arr));
		
		int [] newarray=Arrays.copyOf(arr, arr.length+1);
		newarray[newarray.length-1]=newElement;
		
		System.out.println(Arrays.toString(newarray));
		
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(11);
		arrayList.add(22);
		arrayList.add(33);
		arrayList.add(44);
		arrayList.add(55);
		
		System.out.println(arrayList);
		
		arrayList.add(5,66);
		System.out.println(arrayList);
		
		arrayList.add(0,77);
		System.out.println(arrayList);
		
		int [] arr1= {2,3,4};
		newElement=1;
		
		int arr2[]=new int[arr1.length+1];
		arr2[0]=newElement;
		System.arraycopy(arr1, 0, arr2, 1, arr1.length);
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		int arr3[]=new int[10];
		
		
		
		
		
		
	}

}
