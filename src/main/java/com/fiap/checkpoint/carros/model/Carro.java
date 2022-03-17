package com.fiap.checkpoint.carros.model;

import java.util.Random;

public class Carro {
	private int id;
	private String marca;
	private String modelo;
	private int ano;
	private int portas;
	private int aro;
	private String combustivel;
	
	public Carro() {
		super();
	}

	public Carro(String marca, String modelo, int ano, int portas, int aro, String combustivel) {
		this.id = new Random().nextInt(9000) + 1000;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.portas = portas;
		this.aro = aro;
		this.combustivel = combustivel;
	}
	
	public int getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
}
