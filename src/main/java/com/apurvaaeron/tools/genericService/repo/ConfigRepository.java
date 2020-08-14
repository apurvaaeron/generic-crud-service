package com.apurvaaeron.tools.genericService.repo;

import com.apurvaaeron.tools.genericService.model.Config;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends CrudRepository<Config, Integer>{

}
