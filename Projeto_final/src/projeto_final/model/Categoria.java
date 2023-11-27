package projeto_final.model;

public  abstract class Categoria {
	
	private int numero;
	private int idade;
	private int sub;
	private String nome;
	
	public Categoria(int numero, int idade, int sub, String nome) {
		this.numero = numero;
		this.idade = idade;
		this.sub = sub;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void visualizar() {
		String sub = "";
		switch(this.sub) {
		case 1 -> sub = "Categoria Menores (menor de 18 anos )" ;
		case 2 -> sub = "Categoria Maiores (maior de 18 anos )" ; 
		
		}
		System.out.println("\n\n*************************************");
		System.out.println("Dados da conta");
		System.out.println("\n\n*************************************");
		System.out.println("Número do jogador : " + this.numero);
		System.out.println("Categoria do jogador : " + sub);
		System.out.println("Nome do Jogador : " + this.nome);
		System.out.println("Idade do Jogador : " + this.idade);
	}
	
	
	
}
