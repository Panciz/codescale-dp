package org.dpoletti.codesignal.arcade;

import org.junit.Assert;
import org.junit.Test;

public class IntroTest {

	@Test
	public void test() {

		Assert.assertTrue(!Intro.almostIncreasingSequence(new int[] {1, 3, 2, 1}));
			Assert.assertTrue(Intro.almostIncreasingSequence(new int[] {1, 3, 2}));
				Assert.assertTrue(Intro.almostIncreasingSequence(new int[] {10, 1, 2, 3, 4, 5}));
				Assert.assertTrue(Intro.almostIncreasingSequence(new int[] {0, -2, 5, 6}));
				Assert.assertTrue(!Intro.almostIncreasingSequence(new int[] {1, 2, 1, 2}));
				Assert.assertTrue(Intro.almostIncreasingSequence(new int[] {1, 2, 5, 3, 5}));
	}

}
