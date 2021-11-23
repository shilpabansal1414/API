package org.testing.Trigger;

import java.io.IOException;

import org.testing.testscripts.TC1_postRequest;
import org.testing.testscripts.TC2_GetRequest;
import org.testing.testscripts.TC3_Getall;
import org.testing.testscripts.TC4_GetAll_FetchId;
import org.testing.testscripts.TC5_putRequest;
import org.testing.testscripts.TC6_delete;

public class Runner 
{
public static void main(String[] args) throws IOException
{
 TC1_postRequest tc1= new TC1_postRequest();
 tc1.firstTC();
 
 
 /*TC2_GetRequest tc2= new TC2_GetRequest();
 tc2.TC2();
 
 TC3_Getall tc3= new TC3_Getall();
 tc3.tc3();
 
 
 TC4_GetAll_FetchId tc4= new TC4_GetAll_FetchId();
 tc4.tc4();
 
 TC5_putRequest tc5= new TC5_putRequest();
 tc5.tc5();*/
 
 TC6_delete tc6=new TC6_delete();
 tc6.TC6();
}
}
