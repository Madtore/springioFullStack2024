package com.cesur.general.general.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesur.general.general.models.Historical;

@Repository
public interface HistoricalRepository extends JpaRepository<Historical, Long> {

}
