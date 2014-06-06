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
	
	@Test
	public void testRegister(){
		GamePersistence test = GamePersistence.getInstance();
		int returnRegister;
		
		returnRegister = test.updatesRegister();
		
		assertEquals(0, returnRegister);
	}

	@Test
	public void testGetModelNumber(){
		
		GamePersistence instance = GamePersistence.getInstance();		
		GameModel object = instance.getModelNumero("1");
		
		assertEquals("1", object.getName());		
		assertEquals(R.drawable.bt_1 , object.getButton());
		
	}

	@Test
	public void testGetModelNumberNull(){
		
		GamePersistence instance = GamePersistence.getInstance();		
		GameModel object = instance.getModelNumero("a");
		
		assertNull(object);
		
	}
	
}
