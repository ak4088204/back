package com.webapp.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;;
@Controller

public class AllController {
    @Autowired
	Productdao p;
    @Autowired
    inventorydao i;
	
	@RequestMapping("/set")
	public void get(Product pro,Inventory inventory) {
		p.save(pro);
		
		inventory.setProduct_id(pro.getId());
		inventory.setLocation(pro.getLocation());
		inventory.setQuantity(pro.getQuantity());
		inventory.setTimestamp(null);
		
		i.save(inventory);
		
	}
	@CrossOrigin
	@ResponseBody
	@RequestMapping("/all")
	public List<Product> getting(){
		List<Product> products=p.findAll();
		return products;
	}
	
    @CrossOrigin
	@ResponseBody
	@RequestMapping("/good")
	public String hello() {
		return "varata";
	}
    @CrossOrigin
	@ResponseBody
	@PostMapping("/well")
	public String well(@RequestParam(name="name") String a){
		return a;
	}

	@ResponseBody
	@RequestMapping("/hhhh")
	public String hhhh(){
		return "hhhh";
	}
}
