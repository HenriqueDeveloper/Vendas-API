package br.com.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vendas.entity.Produto;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
