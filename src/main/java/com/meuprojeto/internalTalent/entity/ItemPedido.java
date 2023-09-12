package com.meuprojeto.internalTalent.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class ItemPedido {
    private Integer id;
    private Pedido pedido;
    private Produto produto;
    private Integer quantidade;

}
