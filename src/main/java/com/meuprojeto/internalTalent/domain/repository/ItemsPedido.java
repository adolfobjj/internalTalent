package com.meuprojeto.internalTalent.domain.repository;

import com.meuprojeto.internalTalent.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}