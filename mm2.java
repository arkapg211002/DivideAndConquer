import java.util.*;
import java.io.*;
import java.lang.*;
public class mm2 {
    static int max(int a[],int index,int l)
    {
        int max;
        if(index>=l-2)
        {
            if(a[index]>a[index+1])
            {
                return a[index];
            }
            else 
            {
                return a[index+1];
            }
        }
        max=max(a,index+1,l);
        if(a[index]>max)
        {
            return a[index];
        }
        else
        {
            return max;
        }
    }
    static int min(int a[],int index,int l)
    {
        int min;
        if(index>=l-2)
        {
            if(a[index]<a[index+1])
            {
                return a[index];
            }
            else 
            {
                return a[index+1];
            }
        }
        min=min(a,index+1,l);
        if(a[index]<min)
        {
            return a[index];
        }
        else
        {
            return min;
        }
    }
    public static void main(String args[])
    {
        int min,max;
        int a[]={70,250,50,80,140,12,14};
        int l=a.length;
        min=min(a,0,l);
        max=max(a,0,l);
        System.out.println("Minimum element is "+min);
        System.out.println("Maximum element is "+max);
    }
}
