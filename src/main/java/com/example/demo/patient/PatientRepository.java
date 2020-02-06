package com.example.demo.patient;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
	
	List<Patient> findByFileNo(String fileNo);
	
	List<Patient> findAll();
	
	@Query(value = "SELECT COLUMN_NAME FROM information_schema.columns where table_schema = 'medic' and table_name=:tableName", nativeQuery = true)
	List<String> getColName(@Param("tableName") String tableName);

}

