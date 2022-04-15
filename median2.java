import java.util.*;
import java.io.*;
import java.lang.*;

public class median2 {
    public static int median(int a[],int b[])
    {
        int c[]=new int[a.length+b.length],k=0;
        for(int i=0;i<a.length;i++)
        {
            c[k]=a[i];k++;
        }
        for(int j=0;j<b.length;j++)
        {
            c[k]=b[j];k++;
        }
        Arrays.sort(c);
        if(c.length%2!=0)
        {
            return c[c.length/2];
        }
        else
        {
            return (c[c.length/2]+c[c.length/2+1])/2;
        }
    }
    public static void main(String args[])
    {
        int a[]={70,250,50,80,140,12,14};
        int b[]={1,2,3,4,5,6,7,8,9,10};
        int median=median(a,b);
        System.out.println("Median is "+median);
    }
}
