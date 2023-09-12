package com.meuprojeto.internalTalent.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Cliente {
    private Integer id;
    private String nome;
}
