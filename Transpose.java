package basicjavaprograms;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;int j;
		System.out.println("enter number of rows:");
		int r=sc.nextInt();
		System.out.println("enter number of coloumns:");
		int c=sc.nextInt();
		int[][] b=new int[r][c];
		System.out.println("enter the elements of the matrix:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("the given matrix is:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print( b[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("the transpose of the given matrix is:");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(b[j][i]+" ");
			}
			System.out.println(" ");
		}
	}

}
