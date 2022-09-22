package com.fourkites.configmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fourkites.configmanagement.entities.ConfigStatus;
import com.fourkites.configmanagement.service.ConfigService;


@RestController
@RequestMapping("/")
public class ConfigServiceController {
	
	@Autowired
	ConfigService configService;
	
	@GetMapping("reload")
	public List<ConfigStatus> reloadConfigurration() {
		/*
		 * fetch status from db and reload to cache 
		 * 3 --> 0 
		 * 2 --> 1, 
		 * 1-->1,
		 */
		return configService.fetchStatus();
	}

	@PostMapping("deploy")
	public ConfigStatus deployConfig() {
		//updating stauts from : 3->0 and 2->1

		return null;
	}
}
