package br.com.api.calculadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.calculadora.services.CalculadoraService;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
	
	@Autowired
	CalculadoraService calculadoraService;

    @GetMapping("/somar/{num1}/{num2}")
    public double somar(@PathVariable double num1, @PathVariable double num2) {
        return calculadoraService.somar(num1,num2);
    }

    @GetMapping("/subtrair/{num1}/{num2}")
    public double subtrair(@PathVariable double num1, @PathVariable double num2) {
    	return calculadoraService.subtrair(num1,num2);
    }

    @GetMapping("/multiplicar/{num1}/{num2}")
    public double multiplicar(@PathVariable double num1, @PathVariable double num2) {
    	return calculadoraService.multiplicar(num1,num2);
    }

    @GetMapping("/dividir/{num1}/{num2}")
    public double dividir(@PathVariable double num1, @PathVariable double num2) {
    	return calculadoraService.dividir(num1,num2);
    }
}