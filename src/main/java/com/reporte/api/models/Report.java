package com.reporte.api.models;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="reports")
public class Report {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="con_nom_etapa")
	private String conNomEtapa;	
	
	@Column(name="con_nom_marca")
	private String conNomMarca;	
	
	@Column(name="con_empresa")
	private Integer conEmpresa;	
	
	@Column(name="con_nom_empresa")
	private String conNomEmpresa;	
	
	@Column(name="con_cod_almacen")
	private String conCodAlmacen;	
	
	@Column(name="con_nom_almacen")
	private String conNomAlmacen;	
	
	@Column(name="con_nom_ciudad")
	private String conNomCiudad;	
	
	@Column(name="con_usuario")
	private Integer conUsuario;	
	
	@Column(name="con_nom_asesor")
	private String conNomAsesor;	
	
	@Column(name="con_nom_canal")
	private String conNomCanal;	
	
	@Column(name="con_nom_medio")
	private String conNomMedio;	
	
	@Column(name="con_nom_calidad")
	private String conNomCalidad;	
	
	@Column(name="con_nom_campana")
	private String conNomCampana;	
	
	@Column(name="con_nom_tipocontacto")
	private String conNomTipocontacto;	
	
	@Column(name="con_periodo")
	private Integer conPeriodo;	
	
	@Column(name="con_mes")
	private Integer conMes;	
	
	@Column(name="con_dia")
	private Integer conDia;	
	
	@Column(name="con_est_contactado")
	private Integer conEstContactado;	
	
	@Column(name="con_est_desistido")
	private Integer conEstDesistido;	
	
	@Column(name="con_cod_leadgen_id")
	private String conCodLeadgenId;	
	
	@Column(name="con_cantidad")
	private Integer conCantidad;	
	
	@Column(name="con_p_age_dh")
	private Integer conPAgeDh;	
	
	@Column(name="con_p_age_fh")
	private Integer conPAgeFh;	
	
	@Column(name="con_inversion")
	private Double conInversion;	
	
	@Column(name="con_costo")
	private Double conCosto;	
	
	@Column(name="con_nom_catvehiculo")
	private String conNomCatVehiculo;	
	
	@Column(name="fecdesde_campania")
	private Date fecdesdeCampania;	
	
	@Column(name="fechasta_campania")
	private Date fechastaCampania;	
	
	@Column(name="con_segmentacion")
	private String conSegmentacion;	
	
	@Column(name="con_subsegmentacion")
	private String conSubsegmentacion;	
	
	@Column(name="con_fecha")
	private Date conFecha;	
	
	@Column(name="con_plataforma")
	private String conPlataforma;	
	
	@Column(name="con_razon_desistido")
	private String conRazonDesistido;	
	
	@Column(name="con_nom_estado_contactado")
	private String conNomEstadoContactado;	
	
	@Column(name="con_cliente")
	private String conCliente;	
	
	@Column(name="con_cli_cedula")
	private String conCliCedula;	
	
	@Column(name="con_cli_direccion")
	private String conCliDireccion;	
	
	@Column(name="con_cli_mail")
	private String conCliMail;	
	
	@Column(name="con_cli_telefono")
	private String conCliTelefono;	
	
	@Column(name="con_ciudad_cliente")
	private String conCiudadCliente;	
	
	@Column(name="con_direccion_contacto")
	private String conDireccionContacto;	
	
	@Column(name="con_mail_contacto")
	private String conMailContacto;	
	
	@Column(name="con_telefono_celular_contacto")
	private String conTelefonoCelularContacto;	
	
	@Column(name="con_nombres_contacto")
	private String conNombresContacto;	
	
	@Column(name="modelo_version_interes", columnDefinition = "text")
	private String modeloVersionInteres;	
	
	@Column(name="con_nom_permiso_usuario")
	private String conNomPermisoUsuario;	
	
	@Column(name="con_periodo_mes_cierre")
	private String conPeriodoMesCierre;	
	
	@Column(name="con_mes_cierre")
	private String conMesCierre;	
	
	@Column(name="con_periodo_cierre")
	private String conPeriodoCierre;	
	
	@Column(name="con_nom_mes_cierre")
	private String conNomMesCierre;	
	
	@Column(name="con_periodo_reporte_cierre")
	private Integer conPeriodoReporteCierre;	
	
	@Column(name="con_mes_reporte_cierre")
	private Integer conMesReporteCierre;	
	
	@Column(name="con_cantidad_sugerida")
	private Integer conCantidadSugerida;	
	
	@Column(name="con_estado_cierre")
	private Integer conEstadoCierre;	
	
	@Column(name="con_nombre_estado_cierre")
	private String conNombreEstadoCierre;	
	
	@Column(name="con_visita_showroom")
	private String conVisitaShowroom;	
	
	@Column(name="con_nom_platf_ing")
	private String conNomPlatfIng;	
	
	@Column(name="calificado")
	private String calificado;	
	
	@Column(name="con_estado_reg_test_drive")
	private String conEstadoRegTestDrive;	
	
}




