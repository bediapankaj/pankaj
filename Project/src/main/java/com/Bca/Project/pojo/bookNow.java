package com.Bca.Project.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class bookNow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id;

}
