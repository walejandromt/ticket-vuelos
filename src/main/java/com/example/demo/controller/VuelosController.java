package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.VuelosEntity;
import com.example.demo.service.VuelosService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class VuelosController {

	@Autowired
	private VuelosService vuelosService;

	@GetMapping("findAllVuelos")
	public List<VuelosEntity> findAllVuelos() {
		log.info(">>> findAllVuelos");
		return vuelosService.findAllVuelos();
	}

	@PostMapping("guardarVuelo")
	public VuelosEntity guardarVuelo(@RequestBody VuelosEntity entrada) {
		log.info(">>> guardarVuelo {}", entrada);
		return vuelosService.guardarVuelo(entrada);
	}
}
