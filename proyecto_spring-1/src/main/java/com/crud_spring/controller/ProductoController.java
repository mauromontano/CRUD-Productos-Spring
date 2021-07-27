package com.crud_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud_spring.modelo.Producto;
import com.crud_spring.repository.ProductoRepository;

@Controller
@RequestMapping("/productos") // crea la nueva ruta http:localhost:8080/productos
public class ProductoController {

	@Autowired  // crea el objeto 
	private ProductoRepository productoRepository;
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("productos",productoRepository.findAll());
		return "home";
	}
	
	@GetMapping("/create") // crea la nueva ruta http:localhost:8080/productos/create
	public String create() {
		return "create";
	}
	
	@PostMapping("/save")
	public String save(Producto producto) {
		productoRepository.save(producto);
		return "redirect:/productos";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model){
		Producto p= productoRepository.getOne(id);
		model.addAttribute("producto",p);
		return "edit";
	}	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		Producto p= productoRepository.getOne(id);
		productoRepository.delete(p);
		return "redirect:/productos";
	}
}
