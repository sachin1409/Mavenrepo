package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;

//Addational support while executing 
//a Failed Assumptions resultsin test in test being terminated 
//when to use - if test case failed....do not continue 

import org.junit.jupiter.api.Test;

class TestAssumptions {
	
	
	 @Test
	    void testOnDev()
	    {
	        System.setProperty("ENV", "DEV");
	        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), TestAssumptions::message);
	        System.out.println(" continue execution");
	       
	     }

	    @Test
	    void testOnProd()
	    {
	        System.setProperty("ENV", "PROD");
	        Assumptions.assumeTrue("PROD".equals(System.getProperty("ENV")),TestAssumptions::message);
	        System.out.println(" don't continue execution");
	   
	    }

	    private static String message () {
	        return "TEST Execution Failed :: ";
	    }
	
	
	
	}

