package com.atividadegeneration.loja_games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.atividadegeneration.loja_games.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
