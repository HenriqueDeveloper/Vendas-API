package br.com.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vendas.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
