package com.example.demo.diagnosis;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long>{
	List<Diagnosis> findByFileNo(String fileNo);
//	Optional<Diagnosis> findByFileNo(String fileNo);
	Optional<Diagnosis> findById(Long id);
	List<Diagnosis> findAll();
//	List<Diagnosis> findByFileNoList(String fileNo);
	
	@Query(value = "SELECT COLUMN_NAME FROM information_schema.columns where table_schema = 'medic' and table_name=:tableName", nativeQuery = true)
	List<String> getColName(@Param("tableName") String tableName);
	void save(Optional<Diagnosis> updateDiagnosis);

}

