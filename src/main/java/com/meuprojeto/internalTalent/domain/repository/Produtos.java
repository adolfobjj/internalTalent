package com.meuprojeto.internalTalent.domain.repository;

import com.meuprojeto.internalTalent.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}