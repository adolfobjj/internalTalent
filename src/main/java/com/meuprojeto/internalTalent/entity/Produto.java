package com.meuprojeto.internalTalent.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Produto {
    private Integer id;
    private String nome;
    private BigDecimal preco;
}
