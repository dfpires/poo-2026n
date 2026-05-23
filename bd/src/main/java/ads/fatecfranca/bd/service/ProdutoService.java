package ads.fatecfranca.bd.service;

import ads.fatecfranca.bd.model.Produto;
import ads.fatecfranca.bd.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private ProdutoRepository repo;
    // A injeção de dependência será pelo construtor da classe
    public ProdutoService(ProdutoRepository repo){
        this.repo = repo;
    }
    public List<Produto> listar(){
        return repo.findAll();
    }

    public Optional<Produto> buscar(Long id){
        return repo.findById(id);

    }

    public Produto salvar(Produto produto){
        return repo.save(produto);
    }

    public boolean remove(Long id){
        if (repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false; // produto não existe
    }

    public Produto atualiza(Long id, Produto produto){
        if (repo.existsById(id)){
            produto.setId(id); // coloca id no produto
            repo.save(produto); // atualiza
            return produto;
        }
        return null; // produto não existe
    }
}
