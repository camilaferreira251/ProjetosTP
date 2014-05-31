package fga.mds.abcdario.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.model.GameModel;

public class TestGameModel {

	@Test
	public void testJogoModel() {
		GameModel instancia = new GameModel("nome", 1, 2);
		
		assertEquals("nome", instancia.getName());
		assertEquals(1, instancia.getImage());
		assertEquals(2, instancia.getButton());
	}

	@Test
	public void testGetNome() {
		GameModel instancia = new GameModel("nome", 1, 2);
		
		String nome = instancia.getName();
		
		assertEquals("nome", nome);
	}
	
	@Test
	public void testSetNome() {
		GameModel instancia = new GameModel("nome", 1, 2);
		
		String nome = "outro";
		
		instancia.setName(nome);
		
		assertEquals("outro", instancia.getName());
	}
	
	@Test
	public void testGetImagem() {
		GameModel instancia = new GameModel("nome", 1, 2);
		
		int imagem = instancia.getImage();
		
		assertEquals(1, imagem);
	}
	
	@Test
	public void testSetImagem() {
		GameModel instancia = new GameModel("nome", 1, 2);
		
		int imagem = 2;
		
		instancia.setImage(imagem);
		
		assertEquals(2, instancia.getImage());
	}
	
	@Test
	public void testGetBotao() {
		GameModel instancia = new GameModel("nome", 1, 2);
		
		@SuppressWarnings("unused")
		int button = instancia.getButton();
	}
}