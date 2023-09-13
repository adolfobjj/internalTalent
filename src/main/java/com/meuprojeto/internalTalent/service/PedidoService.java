package com.meuprojeto.internalTalent.service;


import com.meuprojeto.internalTalent.rest.dto.PedidoDTO;
import com.meuprojeto.internalTalent.domain.entity.Pedido;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto );
}