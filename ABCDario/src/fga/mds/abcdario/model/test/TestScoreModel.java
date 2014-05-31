package fga.mds.abcdario.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.R;
import fga.mds.abcdario.model.ScoreModel;

public class TestScoreModel {

	@Test
	public void testScoreModel() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		
		assertNotNull(teste);
	}
	
	@Test
	public void testGetAmout() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		int quantidade;
		
		quantidade = teste.getAmout();
		assertEquals(2, quantidade);
	}
	
	@Test
	public void testGetImg_estrela() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		int id;
		
		id = teste.getStarImage();
		assertEquals(R.drawable.img_2_estrelas, id);
	}
	
	@Test
	public void testSetQuantidade() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		int quantidade;
		
		teste.setAmount(3);
		quantidade = teste.getAmout();
		
		assertEquals(3, quantidade);
	}
	
	@Test
	public void testSetImg_estrela() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		int id;
		
		teste.setStarImage(R.drawable.img_0_estrelas);
		id = teste.getStarImage();
		
		assertEquals(R.drawable.img_0_estrelas, id);
	}
	
}