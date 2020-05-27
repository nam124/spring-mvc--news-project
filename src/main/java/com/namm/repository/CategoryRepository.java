package com.namm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namm.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}
