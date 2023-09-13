package com.meuprojeto.internalTalent.domain.repository;

import com.meuprojeto.internalTalent.domain.entity.Cliente;
import com.meuprojeto.internalTalent.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}