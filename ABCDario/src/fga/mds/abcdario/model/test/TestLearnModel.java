package fga.mds.abcdario.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.model.LearnModel;

public class TestLearnModel {

	@Test
	public void testAprenderModel() {
		LearnModel teste = new LearnModel("nome", 1, 2);
		
		assertEquals("nome", teste.getName());
		assertEquals(1, teste.getImage());
		assertEquals(2, teste.getAudio());
	}
	
	@Test
	public void testGetNome() {
		LearnModel instancia = new LearnModel("nome", 1, 2);
		
		String nome = instancia.getName();
		
		assertEquals("nome", nome);
	}
	
	@Test
	public void testSetNome() {
		LearnModel instancia = new LearnModel("nome", 1, 2);
		
		String nome = "outro";
		
		instancia.setName(nome);
		
		assertEquals("outro", instancia.getName());
	}
	
	@Test
	public void testGetImagem() {
		LearnModel instancia = new LearnModel("nome", 1, 2);
		
		int imagem = instancia.getImage();
		
		assertEquals(1, imagem);
	}
	
	@Test
	public void testSetImagem() {
		LearnModel instancia = new LearnModel("nome", 1, 2);
		
		int imagem = 2;
		
		instancia.setImage(imagem);
		
		assertEquals(2, instancia.getImage());
	}
	
	@Test
	public void testGetAudio() {
		LearnModel instancia = new LearnModel("nome", 1, 2);
		
		int botao = instancia.getAudio();
		
		assertEquals(2, botao);
	}
	
	@Test
	public void testSetAudio() {
		LearnModel instancia = new LearnModel("nome", 1, 2);
		
		int botao = 3;
		
		instancia.setAudio(botao);
		
		assertEquals(3, instancia.getAudio());
	}

}
