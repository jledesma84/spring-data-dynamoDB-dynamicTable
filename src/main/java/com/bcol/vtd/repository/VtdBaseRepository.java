package com.bcol.vtd.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.bcol.vtd.model.VtdBase;

@EnableScan
public interface VtdBaseRepository extends CrudRepository<VtdBase, String> {
	VtdBase findByIdSesion(String idSesion);
}