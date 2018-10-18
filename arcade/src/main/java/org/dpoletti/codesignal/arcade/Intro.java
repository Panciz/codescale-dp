package org.dpoletti.codesignal.arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Intro {

	
	
	public static boolean almostIncreasingSequence(int[] sequence) {
		//Arrays.sort(sequence);
		ArrayList<Integer> seq = new ArrayList<>();
		for(int i = 0;i<sequence.length;i++) {
			seq.add(sequence[i]);
		}
		return almostIncreasingSequence(seq,true);
		
		
	
	}
	public static boolean almostIncreasingSequence(ArrayList<Integer> seq ,boolean tryAgain) {
		for(int j=0;j<seq.size()-1;j++) {
			if(seq.get(j) >= seq.get(j+1)) {
				if(!tryAgain) {
					return false;
				}
				
				ArrayList<Integer> shorter= (ArrayList<Integer>) seq.clone();
				shorter.remove(j);
				if(almostIncreasingSequence(shorter,false)) {
					return true;
				}
				shorter= (ArrayList<Integer>) seq.clone();
				shorter.remove(j+1);
				if(almostIncreasingSequence(shorter,false)) {
					return true;
				}
				return false;
			}
		}
		return true;
	}
}
