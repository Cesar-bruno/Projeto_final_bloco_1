package projeto_final.controller;

import java.util.ArrayList;
import java.util.Optional;

import projeto_final.model.Categoria;
import projeto_final.repository.CategoriaRepository;

public class CategoriaController implements CategoriaRepository{
	
	private ArrayList<Categoria> listaCategorias = new ArrayList <Categoria> () ;
	
	int num = 0;
	
	public void procurarPorNumero(int numero) {
		Optional<Categoria> categoria = buscarNaCollection(numero);
		 
		 if (categoria.isPresent())
			 categoria.get().visualizar();
		 else 
			 System.out.println("O jogador " + numero + " não foi encontrada");
		
	}

	@Override
	public void listarTodas() {
		
		for(var categoria : listaCategorias) {
			categoria.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Categoria categoria) {
		listaCategorias.add(categoria);
		System.out.println("O jogador : " + categoria.getNumero() + " foi criada com sucesso.");
		
		
	}

	@Override
	public void atualizar(Categoria categoria) {
		
		Optional<Categoria> buscaconta = buscarNaCollection(categoria.getNumero());
		 
		 if (buscaconta.isPresent()) {
			listaCategorias.set(listaCategorias.indexOf(buscaconta.get()),categoria);
				System.out.println(" O jogador  " + categoria.getNumero() + " foi atualizado com sucesso .");
		 } else 
			 System.out.println("O jogador  " + categoria.getNumero() + " não foi encontrada");
		
	}

	@Override
	public void deletar(int numero) {
		
		Optional<Categoria> categoria = buscarNaCollection(numero);
		 
		 if (categoria.isPresent()) {
			if (listaCategorias.remove(categoria.get()) == true)
				System.out.println(" O jogador número " + numero + " foi excluida com sucesso .");
		 } else 
			 System.out.println("O jogador número " + numero + " não foi encontrado");
	}

	public int gerarNumero() {
		return ++ num;
	}
	
	public Optional <Categoria> buscarNaCollection(int numero) {
		for (var categoria: listaCategorias) {
			if (categoria.getNumero() == numero)
				return Optional.of(categoria);
		
		}
		
		return Optional.empty();
	}
}
	