package com.bcol.vtd.service.impl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcol.vtd.model.VtdBase;
import com.bcol.vtd.model.dto.VtdBaseRequest;
import com.bcol.vtd.repository.VtdBaseRepository;
import com.bcol.vtd.service.VtdBaseService;

@Service
public class VtdBaseImpl implements VtdBaseService{
	
	@Autowired
	VtdBaseRepository vtdBaseRepository;
	
	Logger logger = Logger.getLogger("logger");
	
	@Override
	public VtdBase findByIdSesion(String idSesion) {
		return vtdBaseRepository.findByIdSesion(idSesion);
	}
	
	@Override
	public void saveVtdBase(VtdBaseRequest request) {
		VtdBase vtdBase = new VtdBase();
		
		vtdBase.setIdSesion(request.getIdSesion());
		vtdBase.setTimestampTransaccion(request.getTimestampTransaccion());
		vtdBase.setCanal(request.getCanal());
		vtdBase.setIdAplicacion(request.getIdAplicacion());
		
		vtdBase.setDispositivo(request.getDispositivo());
		vtdBase.setInfoTransaccion(request.getInfoTransaccion());
		vtdBase.setCliente(request.getCliente());
		vtdBase.setDocumento(request.getDocumento());
		vtdBase.setEncuesta(request.getEncuesta());
		
		vtdBaseRepository.save(vtdBase);
	} 
}
