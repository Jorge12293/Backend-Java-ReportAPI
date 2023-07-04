package com.reporte.api.services;

import java.util.List;

//import com.reporte.api.dto.ReportDto;
import com.reporte.api.models.Report;

public interface ReportService {
	List<Report> getAllReports();
	Report getFindById(Long id);
	List<Report> getListReportsLimit(Long limit);
	
}
