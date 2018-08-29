package com.bcol.vtd.rest;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bcol.vtd.model.VtdBase;
import com.bcol.vtd.model.dto.VtdBaseRequest;
import com.bcol.vtd.service.VtdBaseService;

@org.springframework.web.bind.annotation.RestController
public class VtdBaseController {
	
	Logger logger = Logger.getLogger("Logger");
	
	@Autowired
	VtdBaseService vtdBaseService;
	
	@RequestMapping("/saveVtdBase")
	public ResponseEntity<String> saveVtdBase(@RequestBody VtdBaseRequest vtdBaseRequest, HttpServletResponse response){
		vtdBaseService.saveVtdBase(vtdBaseRequest);
		response.setContentType("application/x-amz-json-1.0");
		return ResponseEntity.ok("Done");
	}
	
	@RequestMapping(value="/findByIdSesion/{idSesion}", method = RequestMethod.GET)
	public ResponseEntity<VtdBase> findByIdSesion(@PathVariable String idSesion){
		
		return ResponseEntity.ok(vtdBaseService.findByIdSesion(idSesion));
	}
}
