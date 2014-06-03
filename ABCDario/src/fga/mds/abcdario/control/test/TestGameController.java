package fga.mds.abcdario.control.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.control.GameController;

public class TestGameController {

	@Test
	public void testGameController() {
		GameController test = new GameController();
		
		assertNotNull(test);
	}
	
	
}
