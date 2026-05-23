package ads.fatecfranca.bd.controller;

import ads.fatecfranca.bd.model.Produto;
import ads.fatecfranca.bd.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService service;
    private ProdutoController(ProdutoService service){

        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(service.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> buscar(@PathVariable Long id){
        Optional<Produto> aux = service.buscar(id);
        if (aux.isPresent()){
            return ResponseEntity.ok(aux);
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        Produto novo = service.salvar(produto);
        URI uri = URI.create("/produtos/"+novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){
        if (service.remove(id)){
            return ResponseEntity.noContent().build(); // 204
        }
        return ResponseEntity.notFound().build(); // 404
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Produto> atualiza(@PathVariable Long id,
                            @RequestBody Produto produto){
        Produto prod = service.atualiza(id, produto);
        if ( prod != null){
            return ResponseEntity.ok(prod);
        }
        return ResponseEntity.notFound().build();
    }
}
