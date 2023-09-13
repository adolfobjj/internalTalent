package com.meuprojeto.internalTalent.controller;

import com.meuprojeto.internalTalent.entity.Cliente;
import com.meuprojeto.internalTalent.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ClienteController {

@Autowired
private Clientes clientes;


    @GetMapping("/api/clientes/{id}")
    @ResponseBody
    public ResponseEntity getClienteById(@PathVariable Integer id ){
        Optional<Cliente> cliente = clientes.findById(id);

        if(cliente.isPresent()){
            return ResponseEntity.ok( cliente.get() );
        }

        return ResponseEntity.notFound().build();
    }

}