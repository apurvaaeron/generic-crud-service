package com.apurvaaeron.tools.genericService.serv;

import com.apurvaaeron.tools.genericService.model.Config;
import com.apurvaaeron.tools.genericService.repo.ConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConfigService {

	// @Autowired annotation provides the automatic dependency injection.
	@Autowired
	ConfigRepository repository;

	// Save student entity in the h2 database.
	public void save(final Config config) {
		repository.save(config);
	}

	// Get all students from the h2 database.
	public List<Config> getAll() {
		final List<Config> configs = new ArrayList<>();
		repository.findAll().forEach(configs::add);
		return configs;
	}

	public Config get(int id) {
		return repository.findById(id).get();
	}

	public int save(String config) {
		Config c = new Config(config);
		save(c);
		return c.getId();
	}

	public int save(int id, String config) {
		Config c = new Config(id, config);
		save(c);
		return c.getId();
	}
}
