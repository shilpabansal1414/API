package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadXML 
{
	/*public static String handleXML(String path)
	{
		
	}*/
	
	public static void main(String[] args) throws IOException 
	{
	 File f= new File("../APIFRAME/XML.xml");
	 FileReader fr=new FileReader(f);
	 BufferedReader br= new BufferedReader(fr);
	 String s;
	 while((s=br.readLine())!=null)
	 {
		 System.out.println(s);
	 }
	}

}
