package test;

public class TGV extends Comboio {

	public TGV(String nome) {
		super(nome);
		this.servico = new ServicoPrioritario();

	}

	
	
	
}
