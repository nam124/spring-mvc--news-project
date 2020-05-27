package com.namm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namm.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
