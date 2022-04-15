//median of two sorted arrays in O(nlogn) and auxiliary space O(1)
import java.util.*;
import java.io.*;
import java.lang.*;

public class median {
    public static int getmedian(int a[],int b[],int n)
    {
        int j=0;
        int i=n-1;
        while(a[i]>b[j] && j<n && i>-1)
        {
            int tmp=a[i];
            a[i]=b[j];
            b[j]=tmp;
            j++;i--;

        }
        Arrays.sort(a);
        Arrays.sort(b);
        return (a[n-1]+b[0])/2;
    }
    public static void main(String args[])
    {
        int a[]={70,250,50,80,140,12,14};
        int b[]={1,2,3,4,5,6,7,8,9,10};
        int n=a.length;
        int m=b.length;
        int median=getmedian(a,b,n);
        System.out.println("Median is "+median);
    }
}
