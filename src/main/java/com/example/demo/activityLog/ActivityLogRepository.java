package com.example.demo.activityLog;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {

	@Query(value = "INSERT INTO activity_log ( message, timestamp ) VALUES ( msg, timestmp )", nativeQuery = true)
	List<String> activityLog(@Param("msg") String msg, @Param("timestmp") LocalDateTime timestmp);

	@Query(value = "SELECT COLUMN_NAME FROM information_schema.columns where table_schema = 'hotelmgtdb' and table_name=:tableName", nativeQuery = true)
	List<String> getColName(@Param("tableName") String tableName);

}
