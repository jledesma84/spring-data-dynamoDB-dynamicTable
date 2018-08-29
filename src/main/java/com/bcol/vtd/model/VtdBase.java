package com.bcol.vtd.model;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "VtdTdc")
public class VtdBase {
	
	@DynamoDBHashKey
	private String idSesion;
	
	@DynamoDBAttribute
	private String timestampTransaccion;
	
	@DynamoDBAttribute
	private String canal;
	
	@DynamoDBAttribute
	private String idAplicacion;
	
	@DynamoDBAttribute
	private Dispositivo dispositivo;
	
	@DynamoDBAttribute
	private List<InfoTransaccion> infoTransaccion;
	
	@DynamoDBAttribute
	private Cliente cliente;
	
	@DynamoDBAttribute
	private List<Documento> documento;
	
	@DynamoDBAttribute
	private List<Encuesta> encuesta;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public String getTimestampTransaccion() {
		return timestampTransaccion;
	}

	public void setTimestampTransaccion(String timestampTransaccion) {
		this.timestampTransaccion = timestampTransaccion;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getIdAplicacion() {
		return idAplicacion;
	}

	public void setIdAplicacion(String idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public List<InfoTransaccion> getInfoTransaccion() {
		return infoTransaccion;
	}

	public void setInfoTransaccion(List<InfoTransaccion> list) {
		this.infoTransaccion = list;
	}

	public List<Documento> getDocumento() {
		return documento;
	}

	public void setDocumento(List<Documento> documento) {
		this.documento = documento;
	}

	public List<Encuesta> getEncuesta() {
		return encuesta;
	}

	public void setEncuesta(List<Encuesta> encuesta) {
		this.encuesta = encuesta;
	}
}
