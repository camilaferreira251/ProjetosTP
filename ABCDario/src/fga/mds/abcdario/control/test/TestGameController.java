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
	

	@Test
	public void testGetModelLetra(){
		GameController test = new GameController();
		int id[] = new int[2];
		
		id = test.getModelLetra();
		
		assertNotNull(id);
	}
	

	@Test
	public void testGetIdBotaoNumero(){
		GameController test = new GameController();
		int id;
		
		id = test.getIdBotaoNumero();
		
		assertNotNull(id);
	}

	@Test
	public void testGetIdBotaoLetra(){
		GameController test = new GameController();
		int id;
		
		id = test.getIdBotaoLetra();
		
		assertNotNull(id);
	}
}
