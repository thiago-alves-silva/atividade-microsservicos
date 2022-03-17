package com.fiap.checkpoint.carros.controllers;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.checkpoint.carros.model.Carro;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView home(HttpServletRequest req) {
		ModelAndView modelAndView = new ModelAndView("home");
		
		Carro carro1 = new Carro("Fiat", "Uno", 2022, 4, 15, "Flex");
		Carro carro2 = new Carro("Chevrolet", "Onix", 2018, 4, 15, "Flex");
		Carro carro3 = new Carro("Volkswagen", "Gol", 2002, 2, 13, "Gasolina");
		Carro carro4 = new Carro("Chevrolet", "Monza", 2000, 2, 13, "Álcool");
		Carro carro5 = new Carro("Peugeot", "306", 2010, 4, 13, "Gasolina");
		
		List<Carro> carros = Arrays.asList(carro1, carro2, carro3, carro4, carro5);
		
		modelAndView.addObject("carros", carros);
		
		return  modelAndView;
	}
}
	