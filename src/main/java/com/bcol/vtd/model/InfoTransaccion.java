package com.bcol.vtd.model;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class InfoTransaccion {
	
	@DynamoDBAttribute
	private String fechaTransaccion;
	
	@DynamoDBAttribute
	private String pasoFuncional;
	
	@DynamoDBAttribute
	private List<MensajeError> mensajeError;

	public String getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(String fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public String getPasoFuncional() {
		return pasoFuncional;
	}

	public void setPasoFuncional(String pasoFuncional) {
		this.pasoFuncional = pasoFuncional;
	}

	public List<MensajeError> getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(List<MensajeError> mensajeError) {
		this.mensajeError = mensajeError;
	}
}