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


	@Test
	public void testDefineImgStars5(){
		ScoreController test = new ScoreController();
		int id;
		
		id = test.definirImgEstrelas(100);
		
		assertEquals(R.drawable.img_5_estrelas, id); 
	}

	@Test
	public void testDefineImgStars4(){
		ScoreController test = new ScoreController();
		int id;
		
		id = test.definirImgEstrelas(70);
		
		assertEquals(R.drawable.img_4_estrelas, id);
	}
	
	@Test
	public void testDefineImgStars3(){
		ScoreController test = new ScoreController();
		int id;
		
		id = test.definirImgEstrelas(50);
		
		assertEquals(R.drawable.img_3_estrelas, id);
	}
	
	@Test
	public void testDefineImgStars2(){
		ScoreController test = new ScoreController();
		int id;
		
		id = test.definirImgEstrelas(30);
		
		assertEquals(R.drawable.img_2_estrelas, id);
	}
	
	@Test
	public void testDefineImgStars1(){
		ScoreController test = new ScoreController();
		int id;
		
		id = test.definirImgEstrelas(15);
		
		assertEquals(R.drawable.img_1_estrela, id);
	}
	
	@Test
	public void testDefineImgStars0(){
		ScoreController test = new ScoreController();
		int id;
		
		id = test.definirImgEstrelas(0);
		
		assertEquals(R.drawable.img_0_estrelas, id);
	}
	
	@Test
	public void testDefineImageStars(){
		ScoreController test = new ScoreController();
		int id;
		
		id = test.definirImgEstrelas(-1);
		
		assertEquals(R.drawable.img_0_estrelas, id);
	}
}
