import java.util.*;
import java.io.*;

class PackerUnpacker1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        String FileNmae = sobj.nextLine();

    try
    {
        File fobj = new File(FileNmae);

        boolean bret = false;
        bret = fobj.exists();

        if(bret == true)
        {
            System.out.println("File is present");
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
    catch(Exception obj)
    {
        System.out.println("Exception occured");
    }
        
    }
}