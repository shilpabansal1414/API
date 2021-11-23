package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead 
{
 public static Properties PropertyFileRead(String filePath) throws IOException
 {
	 File f= new File(filePath);//creating file object to for property file path
	 FileReader fr= new FileReader(f);// reading the file
	 Properties pr= new Properties();//properties class given by java 
	 pr.load(fr);//loading the property file
	 return pr; // if a method is returning a object of a class then we need to mention the name of class in the method name
	 
	
 }
}
