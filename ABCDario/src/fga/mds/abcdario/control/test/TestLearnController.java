package fga.mds.abcdario.control.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.control.LearnController;

public class TestLearnController {

	@Test
	public void testAprenderController() {
		LearnController test = new LearnController();
		
		assertNotNull(test);
	}
	
}
