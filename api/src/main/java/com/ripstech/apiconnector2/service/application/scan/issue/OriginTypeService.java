package com.ripstech.apiconnector2.service.application.scan.issue;

import com.fasterxml.jackson.core.type.TypeReference;
import com.ripstech.api.entity.receive.application.scan.issue.origin.Type;
import com.ripstech.apiconnector2.annotation.AuthRequired;
import com.ripstech.apiconnector2.service.template.GetService;

import java.util.List;

@AuthRequired(false)
public class OriginTypeService extends GetService<Type> {

	public OriginTypeService(String baseUri) {
		super(baseUri);
	}

	@Override
	public TypeReference<Type> getGenericType() {
		return new TypeReference<Type>() {};
	}

	@Override
	public TypeReference<List<Type>> getGenericListType() {
		return new TypeReference<List<Type>>() {};
	}

	@Override
	protected String getPath() {
		return "applications/scans/issues/origins/types";
	}
}
