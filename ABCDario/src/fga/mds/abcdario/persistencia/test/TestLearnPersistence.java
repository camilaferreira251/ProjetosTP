package fga.mds.abcdario.persistencia.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.R;
import fga.mds.abcdario.model.LearnModel;
import fga.mds.abcdario.persistencia.LearnPersistence;

public class TestLearnPersistence {
	@Test
	public void testGetInstance() {
    	LearnPersistence instancia = LearnPersistence.getInstance();
    	LearnPersistence instancia2 = LearnPersistence.getInstance();
		
		assertEquals(instancia, instancia2);
	}

}