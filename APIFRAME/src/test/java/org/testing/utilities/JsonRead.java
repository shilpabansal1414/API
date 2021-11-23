package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonRead 
{
public static String ReadJsonData(String jsonFilePath) throws FileNotFoundException
{
	File f= new File(jsonFilePath);
	FileReader fr= new FileReader(f);
	JSONTokener jt=new JSONTokener(fr);
	JSONObject jo=new JSONObject(jt);
	return jo.toString();
	
}
}
