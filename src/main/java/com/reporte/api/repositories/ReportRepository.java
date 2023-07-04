package com.reporte.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.reporte.api.models.Report;

public interface ReportRepository extends JpaRepository<Report, Long>{
	
	@Query(value = "SELECT * FROM Reports LIMIT :limit", nativeQuery = true)
    List<Report> listReportLimit(@Param("limit") Long limit);
}
