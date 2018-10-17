package arcade;

import org.junit.Assert;
import org.junit.Test;

public class IntroTest {

	@Test
	public void testAlmostIncreasing() {
			Assert.assertTrue(!Intro.almostIncreasingSequence(new int[] {1, 3, 2, 1}));
	}

}
