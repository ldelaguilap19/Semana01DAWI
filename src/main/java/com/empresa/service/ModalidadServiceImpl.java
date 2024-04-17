package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Modalidad;
import com.empresa.repository.ModalidadRepository;

@Service
public class ModalidadServiceImpl implements ModalidadService{

	@Autowired //inyecta componentes de spring a la clase
	private ModalidadRepository repository;
	
	
	@Override//indica que listaMod es un metodo se m.service no se está creando
	//un nuevo método, sino que se sobreescribe
	public List<Modalidad> listaModalidad() {
		return repository.findAll();
	}

	//implementamos el método abstracto que creamos en MODALIDADSERVICE
	@Override
	public Modalidad insertaModalidad(Modalidad obj) {
		return repository.save(obj);
	}

}
