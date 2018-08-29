package com.bcol.vtd.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class InfoVivienda {
	
	@DynamoDBAttribute
	private String idCiudadDeptoResidencia;
	
	@DynamoDBAttribute
	private String ciudadDeptoResidencia;
	
	@DynamoDBAttribute
	private String telFijo;
	
	@DynamoDBAttribute
	private String direccion;
	
	@DynamoDBAttribute
	private String idEstrato;
	
	@DynamoDBAttribute
	private String estrato;

	@DynamoDBAttribute
	private String idTipoVivienda;
	
	@DynamoDBAttribute
	private String tipoVivienda;
	
	@DynamoDBAttribute
	private String valorPagoArrendamiento;
	
	@DynamoDBAttribute
	private String codigoDireccionFuente;
	
	@DynamoDBAttribute
	private String codigoTipoDireccionFuente;

	public String getIdCiudadDeptoResidencia() {
		return idCiudadDeptoResidencia;
	}

	public void setIdCiudadDeptoResidencia(String idCiudadDeptoResidencia) {
		this.idCiudadDeptoResidencia = idCiudadDeptoResidencia;
	}

	public String getCiudadDeptoResidencia() {
		return ciudadDeptoResidencia;
	}

	public void setCiudadDeptoResidencia(String ciudadDeptoResidencia) {
		this.ciudadDeptoResidencia = ciudadDeptoResidencia;
	}

	public String getTelFijo() {
		return telFijo;
	}

	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getIdEstrato() {
		return idEstrato;
	}

	public void setIdEstrato(String idEstrato) {
		this.idEstrato = idEstrato;
	}
	
	public String getEstrato() {
		return estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public String getIdTipoVivienda() {
		return idTipoVivienda;
	}

	public void setIdTipoVivienda(String idTipoVivienda) {
		this.idTipoVivienda = idTipoVivienda;
	}

	public String getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public String getValorPagoArrendamiento() {
		return valorPagoArrendamiento;
	}

	public void setValorPagoArrendamiento(String valorPagoArrendamiento) {
		this.valorPagoArrendamiento = valorPagoArrendamiento;
	}

	public String getCodigoDireccionFuente() {
		return codigoDireccionFuente;
	}

	public void setCodigoDireccionFuente(String codigoDireccionFuente) {
		this.codigoDireccionFuente = codigoDireccionFuente;
	}

	public String getCodigoTipoDireccionFuente() {
		return codigoTipoDireccionFuente;
	}

	public void setCodigoTipoDireccionFuente(String codigoTipoDireccionFuente) {
		this.codigoTipoDireccionFuente = codigoTipoDireccionFuente;
	}
}
