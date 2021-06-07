package com.example.demo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.VuelosEntity;
import com.example.demo.repository.VuelosRepository;
import com.example.demo.service.VuelosService;

@Service
public class VuelosServiceImpl implements VuelosService {

	@Autowired
	private VuelosRepository vuelosRepository;

	@Override
	public List<VuelosEntity> findAllVuelos() {
		return vuelosRepository.findAll();
	}

	@Override
	@Transactional
	public VuelosEntity guardarVuelo(VuelosEntity entrada) {
		return vuelosRepository.save(entrada);
	}

}
