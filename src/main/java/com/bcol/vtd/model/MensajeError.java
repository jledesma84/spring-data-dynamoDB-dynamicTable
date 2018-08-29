package com.bcol.vtd.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class MensajeError {
	@DynamoDBAttribute
	private String servicio;
	
	@DynamoDBAttribute
	private String operacion;
	
	@DynamoDBAttribute
	private String codigoError;
	
	@DynamoDBAttribute
	private String tipoExcepcion;
	
	@DynamoDBAttribute
	private String descripcionInterna;
	
	@DynamoDBAttribute
	private String codigoFuncional;
	
	@DynamoDBAttribute
	private String descripcionFuncional;

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getTipoExcepcion() {
		return tipoExcepcion;
	}

	public void setTipoExcepcion(String tipoExcepcion) {
		this.tipoExcepcion = tipoExcepcion;
	}

	public String getDescripcionInterna() {
		return descripcionInterna;
	}

	public void setDescripcionInterna(String descripcionInterna) {
		this.descripcionInterna = descripcionInterna;
	}

	public String getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public String getDescripcionFuncional() {
		return descripcionFuncional;
	}

	public void setDescripcionFuncional(String descripcionFuncional) {
		this.descripcionFuncional = descripcionFuncional;
	}
}
