package com.bcol.vtd.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class InfoFinanciera {
	@DynamoDBAttribute
	private String activos;
	
	@DynamoDBAttribute
	private String gastosFamiliares;
	
	@DynamoDBAttribute
	private String ingresos;

	public String getActivos() {
		return activos;
	}

	public void setActivos(String activos) {
		this.activos = activos;
	}

	public String getGastosFamiliares() {
		return gastosFamiliares;
	}

	public void setGastosFamiliares(String gastosFamiliares) {
		this.gastosFamiliares = gastosFamiliares;
	}

	public String getIngresos() {
		return ingresos;
	}

	public void setIngresos(String ingresos) {
		this.ingresos = ingresos;
	}
}
