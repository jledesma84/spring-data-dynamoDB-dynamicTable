package com.bcol.vtd.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Documento {
	@DynamoDBAttribute
	private String  tipoDocumento;
	
	@DynamoDBAttribute
	private String refDocumento;
	
	@DynamoDBAttribute
	private String descripcion;
	
	@DynamoDBAttribute
	private String fechaRegistro;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getRefDocumento() {
		return refDocumento;
	}

	public void setRefDocumento(String refDocumento) {
		this.refDocumento = refDocumento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}
