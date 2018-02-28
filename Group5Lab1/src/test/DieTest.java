package test;

import static org.junit.Assert.*;
import org.junit.Test;
import core.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			
			if(d.getDieValue() > 6)
			{
				fail("die value is too high");			}
		}

	}

}