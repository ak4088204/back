package com.webapp.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface inventorydao extends JpaRepository<Inventory,Integer> {

}
