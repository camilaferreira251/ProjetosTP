package fga.mds.abcdario.persistencia.test;

import static org.junit.Assert.*;
import org.junit.Test;
import fga.mds.abcdario.R;
import fga.mds.abcdario.model.GameModel;
import fga.mds.abcdario.persistencia.GamePersistence;


public class TestGamePersistence {

	@Test	
	public void testGetInstance() {
		
		GamePersistence firstInstance = GamePersistence.getInstance();
		GamePersistence secondInstance = GamePersistence.getInstance();
		
		assertEquals(firstInstance, secondInstance);
	}

}
