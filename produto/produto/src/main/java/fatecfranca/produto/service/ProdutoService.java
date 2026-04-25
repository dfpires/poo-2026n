package fatecfranca.produto.service;

import fatecfranca.produto.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    // cria a lista de produtos
    private List<Produto> lista = new ArrayList<Produto>();
    private Long nextId = 1L;

    public List<Produto> listar(){
        return this.lista;
    }
    public Produto criar(Produto p){
        p.setId(nextId); // insere id
        nextId++; // atualiza id
        this.lista.add(p); // adiciona na lista
        return p; // retorna produto
    }
}
