package org.testing.utilities;

import java.util.regex.Pattern;

public class VariableReplacement 
{
 public static String variablevalue(String jsondata,String variableName, String variableValue)
 {
	String replacedvalue= jsondata.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
	return replacedvalue;
 }
}
