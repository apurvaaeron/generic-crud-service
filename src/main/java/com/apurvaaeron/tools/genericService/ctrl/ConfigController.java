package com.apurvaaeron.tools.genericService.ctrl;

import com.apurvaaeron.tools.genericService.serv.ConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ConfigController {

	private final Logger log = LoggerFactory.getLogger(this.getClass()); 

	@Autowired
	ConfigService service;

	@PostMapping(value= "/config/save")
	public int update(final @RequestBody @Valid String config) {
		log.info("Saving config details in the database.");
		return service.save(config);
	}

	@PostMapping(value= "/config/save/{id}")
	public int create(final @PathVariable int id,  final @RequestBody @Valid String config) {
		log.info("Saving config details in the database.");
		return service.save(id, config);
	}

	@GetMapping(value= "/config/get/{id}", produces= "application/vnd.jcg.api.v1+json")
	public Object get(final @PathVariable int id) {
		log.info("Getting config details from the database.");
		return service.get(id);
	}

	@GetMapping(value= "/config/getall", produces= "application/vnd.jcg.api.v1+json")
	public Object getAll() {
		log.info("Getting config details from the database.");
		return service.getAll();
	}
}
