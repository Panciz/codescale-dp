package org.dpoletti.codesignal.arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Intro {

	
	
	public static boolean almostIncreasingSequence(int[] sequence) {
		//Arrays.sort(sequence);
		
		
		List<Integer> list = new ArrayList();
		for (int i : sequence)
		{
			list.add(i);
		}
		boolean oneError=false;
		
		while(!list.isEmpty()) {
			
		}
		return true;
		
	/*	boolean oneMiss=false;
		int i =0;
		if(sequence[i]>=sequence[i+1]) {
			i++;
			oneMiss=true;
		}
		
		
		while(i<sequence.length-1) {
			if(sequence[i]>=sequence[i+1]) {
				if(oneMiss)
					return false;
				oneMiss=true;
				//Controllo subito avanti se fallisco di nuovo
				//se non e' verificata la prima condizione sono alla fine dell'array
				if(i+2<sequence.length && sequence[i]>=sequence[i+2]) {
						return false;
				}
				//Vado avanti di due
				i++;
			}
			i++;
		}
		
	    return true;*/
	}

}
