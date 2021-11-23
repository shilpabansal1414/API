package org.testing.utilities;

import java.util.Random;

public class RandomNumber 
{
 public static Integer RandomNo()
 {
	 Random r= new Random();
	 return r.nextInt();
 }
}
