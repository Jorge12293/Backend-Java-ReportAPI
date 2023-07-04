package com.reporte.api.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportDto {
	
	private Long id;
	private String conNomEtapa;	
	private String conNomMarca;	
	private Integer conEmpresa;	
	private String conNomEmpresa;	
	private String conCodAlmacen;	
	private String conNomAlmacen;	
	private String conNomCiudad;	
	private Integer conUsuario;	
	private String conNomAsesor;	
	private String conNomCanal;	
	private String conNomMedio;	
	private String conNomCalidad;	
	private String conNomCampana;	
	private Integer conPeriodo;	
	private Integer conMes;	
	private Integer conDia;	
}




