package com.bcol.vtd.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class InfoIngresoEstimado {
	@DynamoDBAttribute
	private String ingresoEstimado;
	
	@DynamoDBAttribute
	private String fuenteIngresoEstimado;

	public String getIngresoEstimado() {
		return ingresoEstimado;
	}

	public void setIngresoEstimado(String ingresoEstimado) {
		this.ingresoEstimado = ingresoEstimado;
	}

	public String getFuenteIngresoEstimado() {
		return fuenteIngresoEstimado;
	}

	public void setFuenteIngresoEstimado(String fuenteIngresoEstimado) {
		this.fuenteIngresoEstimado = fuenteIngresoEstimado;
	}
}
