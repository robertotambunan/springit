package com.roberto.springit.repository;

import com.roberto.springit.domain.Link;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
    
    
}