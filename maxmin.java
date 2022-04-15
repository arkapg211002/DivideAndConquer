import java.util.*;
import java.io.*;
import java.lang.*;
class maxmin
{
    static int Max(int a[],int index,int l)
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
        max=Max(a,index+1,l);
        if(a[index]>max)
        {
            return a[index];
        }
        else
        {
            return max;
        }
    }
    static int Min(int a[],int index,int l)
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
        min=Min(a,index+1,l);
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
        max=Max(a,0,a.length);
        min=Min(a,0,a.length);
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }
}