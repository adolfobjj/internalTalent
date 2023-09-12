package com.meuprojeto.internalTalent.entity;

import jakarta.persistence.Entity;
import lombok.Data;


import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Pedido {
    private Integer id;
    private Cliente cliente;
    private LocalDate dataPedido;
    private BigDecimal total;
}

