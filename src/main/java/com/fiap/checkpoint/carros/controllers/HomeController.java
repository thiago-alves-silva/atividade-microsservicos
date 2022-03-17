package com.fiap.checkpoint.carros.controllers;

import java.util.Arrays;

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
		
		modelAndView.addObject("carros", Arrays.asList(
				new Carro("Fiat", "Uno", 2022, 4, 15, "Flex"), 
				new Carro("Chevrolet", "Onix", 2018, 4, 15, "Flex"), 
				new Carro("Volkswagen", "Gol", 1998, 2, 13, "Gasolina"), 
				new Carro("Chevrolet", "Monza", 2000, 2, 13, "Álcool"), 
				new Carro("Peugeot", "306", 2010, 4, 13, "Gasolina"), 
				new Carro("Hyundai", "HB20", 2021, 4, 14, "Flex"), 
				new Carro("Renault", "Kwid", 2014, 4, 14, "Flex"), 
				new Carro("Volkswagen", "Voyage", 1995, 4, 14, "Álcool")
		));
		
		return  modelAndView;
	}
}
	