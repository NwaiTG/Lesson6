package com.nwai.dentalsys.repository;

import com.nwai.dentalsys.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Optional<Patient> findByPatNo(String patNo);
}
