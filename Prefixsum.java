package Prefixsum;
import java.util.*;

public class Prefixsum {
	   static int n;
	public static int[] prefix(int arr[])
	{
		int a[] = new int[n];
		a[0]=arr[0];
		for(int i=1;i<n;i++) {
			a[i]=a[i-1]+arr[i];
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int pre[]=prefix(arr);
		for(int i=0;i<n;i++) {
			System.out.println(pre[i]+" ");
		}
	}

}
