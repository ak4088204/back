package com.webapp.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Productdao extends JpaRepository<Product, Integer> {

}
