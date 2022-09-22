package com.fourkites.configmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourkites.configmanagement.entities.ConfigStatus;
import com.fourkites.configmanagement.repositories.ConfigRepository;

@Service
public class ConfigService {
	
	@Autowired
	ConfigRepository configRepository;
	
	
	public boolean updateStatus() {
		return true;
	}
	
	public List<ConfigStatus> fetchStatus() {
		return configRepository.findAll();
	}

}
