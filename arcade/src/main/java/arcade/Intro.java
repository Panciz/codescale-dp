package arcade;

import java.util.ArrayList;

public class Intro {

	
	public static boolean almostIncreasingSequence(int[] sequence) {
		ArrayList<Integer> seq = new ArrayList<>();
		for(int i = 0;i<sequence.length;i++) {
			seq.add(sequence[i]);
		}
		int i = -1;
		while(i<sequence.length) {

			ArrayList<Integer> seqCurr= (ArrayList<Integer>) seq.clone();
			if(i>=0) {
				seqCurr.remove(i);
			}
			boolean inc=true;
			for(int j=0;j<seqCurr.size()-1;j++) {
				if(seqCurr.get(j) >= seqCurr.get(j+1)) {
					inc=false;
					break;
				}
			}
			//la prima volta che trovo un true va bene
			if(inc)
				return true;
			i++;
		}
		return false;
		
	
	}
	
}
