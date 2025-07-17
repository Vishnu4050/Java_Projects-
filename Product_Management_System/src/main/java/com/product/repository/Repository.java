package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.Procuct;

public interface Repository extends JpaRepository<Procuct, Long> {

}
