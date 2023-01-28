package br.com.vendas.service;

import java.util.Optional;

import br.com.vendas.entity.Pedido;
import br.com.vendas.enums.StatusPedido;
import br.com.vendas.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
