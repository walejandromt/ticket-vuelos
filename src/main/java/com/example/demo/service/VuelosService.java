package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.VuelosEntity;

public interface VuelosService {

	List<VuelosEntity> findAllVuelos();

	VuelosEntity guardarVuelo(VuelosEntity entrada);

}
