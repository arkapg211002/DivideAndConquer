import java.util.*;
import java.io.*;
import java.lang.*;

public class pow {
    public static int power(int x,int y)
    {
        return (int)Math.pow(x,y);

    }
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        x=sc.nextInt();
        System.out.println("Enter the power");
        y=sc.nextInt();
        System.out.println("The power of "+x+" is "+power(x,y));
    }
}
