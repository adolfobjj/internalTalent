package com.meuprojeto.internalTalent.repository;

import com.meuprojeto.internalTalent.entity.Cliente;
import com.meuprojeto.internalTalent.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}