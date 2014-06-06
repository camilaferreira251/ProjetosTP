package fga.mds.abcdario.persistencia.test;

import static org.junit.Assert.*;
import org.junit.Test;
import fga.mds.abcdario.R;
import fga.mds.abcdario.persistencia.ScorePersistence;

public class TestScorePersistence {

	@Test
	public void testScorePersistencia() {
		ScorePersistence firstTest = ScorePersistence.getInstance();
		ScorePersistence secondTest = ScorePersistence.getInstance();
		
		assertEquals(firstTest, secondTest);
	}

}
