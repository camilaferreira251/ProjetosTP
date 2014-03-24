package jogo;

import android.app.Activity;

public abstract class AbstractActivity extends Activity implements ComportamentoBase {

	@Override
	public abstract void inicializarComponentes();

	@Override
	public abstract void definirEventos();
}
