package fga.mds.abcdario.control.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.R;
import fga.mds.abcdario.control.ScoreController;

public class TestScoreController {

	@Test
	public void testeCalculateSucessPorcent() {
		ScoreController test = new ScoreController();
		double porcent;
		double result = 50.0;
		
		porcent = (double) test.calculaPorcentagemAcertos(5, 5);
		
		assertEquals(result, porcent, 1.0);
	}


}