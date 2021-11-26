import java.io.*;
public class Addition
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader xyz=new InputStreamReader(System.in);
        BufferedReader ins = new BufferedReader(xyz);
        System.out.println("Enter 2 Number");
        int a=Integer.parseInt(ins.readLine());
        int b=Integer.parseInt(ins.readLine());
        System.out.println("Sum = "+(a+b));

    }
}
