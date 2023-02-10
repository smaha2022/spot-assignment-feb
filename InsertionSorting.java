package zoho.test;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {

	        int [] arr = {7,8,2,4,3,9};
            Insertionsort(arr);
	}

	public static void Insertionsort(int[] arr) {
			  for(int i=1;i<arr.length;i++) {
            	for(int j=i;j>0;j--) {
            		if(arr[j]<arr[j-1])       
            		{                         
            			int temp = arr[j];  
            			arr[j]= arr[j-1] ;
            			arr[j-1]= temp;       
            			
            		}
            		else
            			
            			break;
            	}
            }
			  System.out.print("[");
			  for(int i=0;i<arr.length;i++)
			  {
				  
				  System.out.print(arr[i]+" ");
			  }
			  System.out.print("]");
			  System.out.println();
            System.out.println(Arrays.toString(arr));
	}


	}


