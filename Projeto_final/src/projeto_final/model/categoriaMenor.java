package projeto_final.model;

public class categoriaMenor extends Categoria{

	private String nomeDaMae;
	
	public categoriaMenor(int numero, int idade, int sub, String nome,String nomeDaMae) {
		super(numero, idade, sub, nome );
		this.nomeDaMae = nomeDaMae;
		
			
	}
	
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	
	@Override
	public void  visualizar() {
		super.visualizar();
		System.out.println("Nome da Mãe :" + this.nomeDaMae);
		
	}
}
