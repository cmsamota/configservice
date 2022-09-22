package com.fourkites.configmanagement.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fourkites.configmanagement.entities.ConfigStatus;

@Repository
public interface ConfigRepository extends CrudRepository<ConfigStatus, Integer>{

	public List<ConfigStatus> findById(int id);
	public List<ConfigStatus> findAll();
}
