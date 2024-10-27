package com.cesur.general.general.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cesur.general.general.models.Incidence;

@Repository
public interface IncidenceRepository extends JpaRepository<Incidence, Long> {

    @Query("SELECT i FROM Incidence i WHERE i.userCreated.email = :email")
    List<Incidence> findByUserEmail(String email);

}
