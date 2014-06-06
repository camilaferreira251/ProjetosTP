package fga.mds.abcdario.persistencia.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.R;
import fga.mds.abcdario.model.LearnModel;
import fga.mds.abcdario.persistencia.LearnPersistence;

public class TestLearnPersistence {
	@Test
	public void testGetInstance() {
    	LearnPersistence firstinstance = LearnPersistence.getInstance();
    	LearnPersistence secondInstance = LearnPersistence.getInstance();
		
		assertEquals(firstinstance, secondInstance);
	}

	@Test
	public void testRegister(){
		LearnPersistence test = LearnPersistence.getInstance();
		int returnRegister;
		
		returnRegister = test.updatesRegister();
		
		assertEquals(0, returnRegister);
	}
	@Test
	public void testGetModelNumber(){
		
		LearnPersistence instance = LearnPersistence.getInstance();		
		LearnModel objeto = instance.getModelNumber(0);
		
		assertEquals("1", objeto.getName());		
		assertEquals(R.raw.um , objeto.getAudio());
		assertEquals(R.drawable.num_1_um, objeto.getImage());
	}
	

	@Test
	public void testGetModelLetter(){
		
		LearnPersistence instance = LearnPersistence.getInstance();		
		LearnModel objeto = instance.getModelLetter(0);
		
		assertEquals("a", objeto.getName());		
		assertEquals(R.raw.a_aviao , objeto.getAudio());		
		assertEquals(R.drawable.a_abelha, objeto.getImage());
	}

}