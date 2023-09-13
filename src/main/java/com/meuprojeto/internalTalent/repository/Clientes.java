package com.meuprojeto.internalTalent.repository;

import com.meuprojeto.internalTalent.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer > {


    List<Cliente> encontrarPorNome(  String nome );
    void deleteByNome(String nome);
    boolean existsByNome(String nome);
    Cliente findClienteFetchPedidos(  Integer id );


}