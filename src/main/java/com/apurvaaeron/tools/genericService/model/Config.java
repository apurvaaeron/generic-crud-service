package com.apurvaaeron.tools.genericService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// @Entity annotation specifies that the class is mapped to a database table.
@Entity
public class Config {

	// @Id annotation specifies the primary key of an entity.
	// @GeneratedValue provides the generation strategy specification for the primary key values.
	@Id
	@GeneratedValue
	private int id;
	private String val;

	// Default constructor.
	public Config() {	}

	// Parameterized constructor.
	public Config(int id, String val) {
		this.id = id;
		this.val = val;
	}

	public Config(String val) {
		this.val = val;
	}

	// Getters.
	public int getId() {
		return id;
	}

	public String getVal() {
		return val;
	}
}
