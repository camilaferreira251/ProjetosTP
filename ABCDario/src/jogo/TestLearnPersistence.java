package jogo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fga.mds.abcdario.model.LearnModel;

public class TestLearnPersistence {

	@Test
	public void testGetInstance() {
		
		LearnPersistence instancia = LearnPersistence.getInstance();
		LearnPersistence instancia2 = LearnPersistence.getInstance();
		
		assertEquals(instancia, instancia2);
	}

	@Test
	public void testCadastro(){
		LearnPersistence teste = LearnPersistence.getInstance();
		int retorno;
		
		retorno = teste.atualizaCadastro();
		
		assertEquals(0, retorno);
	}
	
	@Test
	public void testGetModelNumero(){
		
		LearnPersistence instancia = LearnPersistence.getInstance();
		
		String j = "number";
		LearnModel objeto = instancia.getModelNumber(j);
		
		assertEquals("1", objeto.getName());
		
	}
	
	@Test
	public void testGetModelLetter(String letra){
		
		LearnPersistence instancia = LearnPersistence.getInstance();
		
		String j = "letter";
		LearnModel objeto = instancia.getModelLetter(j);
		
		assertEquals("a", objeto.getName());
	}
}