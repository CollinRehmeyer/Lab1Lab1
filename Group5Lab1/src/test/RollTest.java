package test;

import static org.junit.Assert.*;

import org.junit.Test;
import core.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			if(r.getScore() > 12)
			{
				fail("roll score is too high");
			}
		}

	}

}