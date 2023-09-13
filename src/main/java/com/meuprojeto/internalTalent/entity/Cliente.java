package com.meuprojeto.internalTalent.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table( name = "cliente" )
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;

    @OneToMany( mappedBy = "cliente" , fetch = FetchType.LAZY )
    private Set<Pedido> pedidos;
}