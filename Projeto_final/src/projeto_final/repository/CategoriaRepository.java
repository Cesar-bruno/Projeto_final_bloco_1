package projeto_final.repository;

import projeto_final.model.Categoria;

public interface CategoriaRepository {
	
	//Crud
	public void procurarPorNumero ( int numero);
	public void listarTodas();
	public void cadastrar(Categoria categoria);
	public void atualizar(Categoria categoria);
	public void deletar(int numero);
	 
}
