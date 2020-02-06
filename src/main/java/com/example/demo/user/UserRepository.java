package com.example.demo.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByPhoneNumber(String phonenumber);
	
	List<User> findAll();

	@Query(value = "SELECT COLUMN_NAME FROM information_schema.columns where table_schema = 'medic' and table_name=:tableName", nativeQuery = true)
	List<String> getColName(@Param("tableName") String tableName);

}
