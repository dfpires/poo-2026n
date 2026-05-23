package ads.fatecfranca.bd.repository;

import ads.fatecfranca.bd.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends
        JpaRepository<Produto, Long> {

    // findAll(), findById(id), save(entity), delete(entity)
    // existsById(), count()
    // Spring gera o SQL por nome do método
    List<Produto> findByNome(String nome);
    List<Produto> findByPrecoLessThan(Double max);
    List<Produto> findByNomeContaining(String termo);

    @Query("SELECT p FROM Produto p WHERE p.preco > :min")
    List<Produto> buscaAcimaDe(@Param("min") Double min);

}
