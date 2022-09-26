/*
	
	Q4) Create a two dimensional array of integers and display:

    sum of all elements of each column
    sum of all elements of each row

*/

package javaAssignment1;

public class ques4 {

	public static void main(String[] args) 
	{
		// 2-D Array and its element
		int[][] arr = 
			{
					{2,3,4},
					{5,6,7},
					{8,9,10},
			};
		
		colWiseSum(arr);
		rowWiseSum(arr);
	}

	private static void rowWiseSum(int[][] arr) 
	{
		int sum;
		for(int i = 0; i<arr.length; i++) 
		{
			sum = 0;
			for(int j = 0; j<arr[i].length;j++) 
			{
				sum += arr[i][j];
			}
			System.out.println("Row " + i+ "sum :"+sum);
		}
		
		
	}

	private static void colWiseSum(int[][] arr) 
	{
		int sum;
		int i=0;
		int j=0;
		while(j<arr.length) 
		{
			i =0;
			sum = 0;
			while(i<arr.length) 
			{
				sum += arr[i][j];
				i++;
			}
			System.out.println("Col " + j+ "sum :"+sum);
			j++;
		}
		
	}

}
