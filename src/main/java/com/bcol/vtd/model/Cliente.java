package com.bcol.vtd.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Cliente {
	
	@DynamoDBAttribute
	private String nombre;
	
	@DynamoDBAttribute
	private String apellido;
	
	@DynamoDBAttribute
	private String tipoDocumento;
	
	@DynamoDBAttribute
	private String identificacion;
	
	@DynamoDBAttribute
	private String correo;
	
	@DynamoDBAttribute
	private String direccionCorrespondencia;
	
	@DynamoDBAttribute
	private InfoLaboral infoLaboral;

	@DynamoDBAttribute
	private InfoFinanciera infoFinanciera;
	
	@DynamoDBAttribute
	private InfoVivienda infoVivienda;
	
	@DynamoDBAttribute
	private InfoIngresoEstimado infoIngresoEstimado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccionCorrespondencia() {
		return direccionCorrespondencia;
	}

	public void setDireccionCorrespondencia(String direccionCorrespondencia) {
		this.direccionCorrespondencia = direccionCorrespondencia;
	}
	
	public InfoLaboral getInfoLaboral() {
		return infoLaboral;
	}

	public void setInfoLaboral(InfoLaboral infoLaboral) {
		this.infoLaboral = infoLaboral;
	}

	public InfoFinanciera getInfoFinanciera() {
		return infoFinanciera;
	}

	public void setInfoFinanciera(InfoFinanciera infoFinanciera) {
		this.infoFinanciera = infoFinanciera;
	}

	public InfoVivienda getInfoVivienda() {
		return infoVivienda;
	}

	public void setInfoVivienda(InfoVivienda infoVivienda) {
		this.infoVivienda = infoVivienda;
	}

	public InfoIngresoEstimado getInfoIngresoEstimado() {
		return infoIngresoEstimado;
	}

	public void setInfoIngresoEstimado(InfoIngresoEstimado infoIngresoEstimado) {
		this.infoIngresoEstimado = infoIngresoEstimado;
	}
}
