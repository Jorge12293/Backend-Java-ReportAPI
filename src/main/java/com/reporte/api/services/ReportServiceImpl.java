package com.reporte.api.services;

import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Service;

//import com.reporte.api.dto.ReportDto;
import com.reporte.api.models.Report;
import com.reporte.api.repositories.ReportRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
@Transactional
public class ReportServiceImpl implements ReportService{

	private final ReportRepository reportRepository;
	
	@Override
	public List<Report> getAllReports() {
		return reportRepository.findAll();
	}

	@Override
	public Report getFindById(Long id) {	
		return reportRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Rporte no encontrado."));
	}

	@Override
	public List<Report> getListReportsLimit(Long limit) {
		return reportRepository.listReportLimit(limit);
	}

}
