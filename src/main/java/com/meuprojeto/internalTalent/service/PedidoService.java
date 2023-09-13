package com.meuprojeto.internalTalent.service;

import com.meuprojeto.internalTalent.domain.entity.Pedido;

import com.meuprojeto.internalTalent.domain.enums.StatusPedido;
import com.meuprojeto.internalTalent.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}