package org.dpoletti.codesignal.arcade;

import java.util.ArrayList;

public class Core {
	
	//You are given a two-digit integer n. Return the sum of its digits.
	public static int addTwoDigits(int n) {

	    int count =0;
	    while(n>0){
	        int m = n/10;
	        m = m*10;
	        
	        count+=n-m;
	        
	        n=n/10;
	        
	        
	    }
	    return count;
		
		
	
	}
}
