import java.util.*;
public class spiralMatrix {
	static void spiral(int arr[][],int row,int col) {
int k=0,l=0;
		
		while(k<row&&l<col)
		{
			for(int i=l;i<col;i++)
				System.out.print(arr[k][i]+" ");
			
			k++;
			
			for(int i=k;i<row;i++)
				System.out.print(arr[i][col-1]+" ");
			
			col--;
			if(k<row)
			{
				for(int i=col-1;i>=l;i--)
					System.out.print(arr[row-1][i]+" ");
				
				row--;
			}
			
			if(l<col)
			{
				for(int i=row-1;i>=k;i--)
					System.out.print(arr[i][l]+" ");
				
				l++;
			}
		}
		
		
		
	}
	
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of row:");
		int row=sc.nextInt();
		System.out.print("Enter the size of column:");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextInt();
		spiral(arr,row,col);
	}
}
