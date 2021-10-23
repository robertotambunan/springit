package com.roberto.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String body;

	// link
	@ManyToOne()
	private Link link;
}



