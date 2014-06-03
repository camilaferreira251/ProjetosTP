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
	
	@Test
	public void testGetModelNumero(){
		GameController test = new GameController();
		int id[] = new int[2];
		
		id = test.getModelNumero();
		
		assertNotNull(id);
	}
	
}
