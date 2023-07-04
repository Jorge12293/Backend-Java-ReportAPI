package com.reporte.api.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reporte.api.models.Report;
import com.reporte.api.services.ReportService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:4200") 
public class ReportRest {
	
	private final ReportService reportService;
	
	@GetMapping("/list-report")
    private ResponseEntity<List<Report>> getListReport() {
		return ResponseEntity.ok(reportService.getAllReports());
    }
	
	@GetMapping("/report/{id}")
    private ResponseEntity<Report> getReport(@PathVariable("id") Long id) {
		return ResponseEntity.ok(reportService.getFindById(id));
	}
    
	@GetMapping("/report-limit/{limit}")
    private ResponseEntity<List<Report>> getReportsLimit(@PathVariable("limit") Long limit) {
		return ResponseEntity.ok(reportService.getListReportsLimit(limit));
	}
}

