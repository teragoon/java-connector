package com.ripstech.apiconnector2.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.ripstech.api.entity.receive.Team;
import com.ripstech.api.entity.send.TeamSend;
import com.ripstech.apiconnector2.service.template.PatchDeletePostGetService;

import java.util.List;

public class TeamService extends PatchDeletePostGetService<Team, TeamSend> {

	public TeamService(String baseUri) {
		super(baseUri);
	}

	@Override
	protected String getPath() {
		return "teams";
	}

	@Override
	public TypeReference<Team> getGenericType() {
		return new TypeReference<Team>() {};
	}

	@Override
	public TypeReference<List<Team>> getGenericListType() {
		return new TypeReference<List<Team>>() {};
	}

}
