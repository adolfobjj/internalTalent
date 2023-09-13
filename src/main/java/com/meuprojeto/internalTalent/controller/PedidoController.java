package com.meuprojeto.internalTalent.controller;

import com.meuprojeto.internalTalent.dto.PedidoDTO;
import com.meuprojeto.internalTalent.entity.Pedido;
import com.meuprojeto.internalTalent.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer save( @RequestBody PedidoDTO dto ){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }

}