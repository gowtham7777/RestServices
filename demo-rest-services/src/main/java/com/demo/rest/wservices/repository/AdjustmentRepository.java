package com.demo.rest.wservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.rest.wservices.domain.AdjustmentItem;

public interface AdjustmentRepository extends JpaRepository<AdjustmentItem, Long> {

}
