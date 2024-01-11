import java.util.*;
import java.io.*;

class PackerUnpacker7
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        String FileName = sobj.nextLine();

    try
    {
        FileInputStream fobj = new FileInputStream(FileName);
        byte Arr[] = new byte[100];

        fobj.read(Arr);
        String str = new String(Arr);

        System.out.println(str);

        
        fobj.close();
        sobj.close();
    }
    catch(Exception obj)
    {
        System.out.println("Exception occured");
    }
        
    }
}