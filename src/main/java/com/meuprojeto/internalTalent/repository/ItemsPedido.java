package com.meuprojeto.internalTalent.repository;

import com.meuprojeto.internalTalent.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}