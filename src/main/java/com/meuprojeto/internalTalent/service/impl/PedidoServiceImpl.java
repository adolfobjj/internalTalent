package com.meuprojeto.internalTalent.service.impl;

import com.meuprojeto.internalTalent.repository.Pedidos;
import com.meuprojeto.internalTalent.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}