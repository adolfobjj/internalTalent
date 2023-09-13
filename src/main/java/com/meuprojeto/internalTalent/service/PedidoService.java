package com.meuprojeto.internalTalent.service;


import com.meuprojeto.internalTalent.dto.PedidoDTO;
import com.meuprojeto.internalTalent.entity.Pedido;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto );
}