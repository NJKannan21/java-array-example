package com.app;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		
		int [] array= {10,20,30,40,50,60};
		int indexRemoved=2;
		
		
		if(indexRemoved<0 || indexRemoved>=array.length)
		{
			System.out.println("Invalid index!!");
		}
		else
		{
			int [] newArray=new int[array.length-1];
			
			
			for(int i=0,j=0;i<array.length;i++)
			{
				if(i!=indexRemoved)
				{
					newArray[j++]=array[i];
				}
			}
			System.out.println(Arrays.toString(array));
			
			System.out.println(Arrays.toString(newArray));
			
		}
		
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(11);
		arrayList.add(22);
		arrayList.add(33);
		arrayList.add(44);
		arrayList.add(55);
		
		System.out.println(arrayList);
		
		//arrayList.remove(indexRemoved);
		Integer valInteger=new Integer(33);
		arrayList.remove(valInteger);
		System.out.println(arrayList);
		
		
		
		
		
		

	}

}
