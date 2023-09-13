package com.meuprojeto.internalTalent.repository;

import com.meuprojeto.internalTalent.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}