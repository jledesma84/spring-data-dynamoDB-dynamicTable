package com.bcol.vtd.service;

import com.bcol.vtd.model.VtdBase;
import com.bcol.vtd.model.dto.VtdBaseRequest;

public interface VtdBaseService {
	VtdBase findByIdSesion(String id);
	void saveVtdBase(VtdBaseRequest request);
}
