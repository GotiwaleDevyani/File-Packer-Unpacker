import java.util.*;
import java.io.*;

class PackerUnpacker5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        String FileName = sobj.nextLine();

    try
    {
        System.out.println("Enter the data that you want to enter in file");
        String Data = sobj.nextLine();

        FileOutputStream fobj = new FileOutputStream(FileName,true);
        byte arr[] = Data.getBytes();
        fobj.write(arr);
        fobj.close();
        
        sobj.close();
    }
    catch(Exception obj)
    {
        System.out.println("Exception occured");
    }
        
    }
}