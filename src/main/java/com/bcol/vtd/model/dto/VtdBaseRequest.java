package com.bcol.vtd.model.dto;

import java.util.List;

import com.bcol.vtd.model.Cliente;
import com.bcol.vtd.model.Dispositivo;
import com.bcol.vtd.model.Documento;
import com.bcol.vtd.model.Encuesta;
import com.bcol.vtd.model.InfoTransaccion;

public class VtdBaseRequest {
	
	private String idSesion;
	private String timestampTransaccion;	
	private String canal;	
	private String idAplicacion;
	private Dispositivo dispositivo;
	private List<InfoTransaccion> infoTransaccion;
	private Cliente cliente;
	private List<Documento> documento;
	private List<Encuesta> encuesta;

	public String getIdAplicacion() {
		return idAplicacion;
	}

	public void setIdAplicacion(String idAplicacion) {
		this.idAplicacion = idAplicacion;
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

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<InfoTransaccion> getInfoTransaccion() {
		return infoTransaccion;
	}

	public void setInfoTransaccion(List<InfoTransaccion> infoTransaccion) {
		this.infoTransaccion = infoTransaccion;
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