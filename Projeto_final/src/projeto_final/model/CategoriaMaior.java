package projeto_final.model;

public class CategoriaMaior extends Categoria{
	
	private int cpf;

	public CategoriaMaior(int numero, int idade, int sub, String nome,int cpf) {
		super(numero, idade, sub, nome);
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void  visualizar() {
		super.visualizar();
		System.out.println("CPF :" + this.cpf);
		
	}

}
