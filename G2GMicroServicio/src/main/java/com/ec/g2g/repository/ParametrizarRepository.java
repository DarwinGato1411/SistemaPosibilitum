package com.ec.g2g.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ec.g2g.entidad.Cliente;
import com.ec.g2g.entidad.Parametrizar;
import com.ec.g2g.entidad.Producto;
import com.ec.g2g.entidad.Tipoambiente;

/**
 * Spring Data JPA repository for the Products entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParametrizarRepository extends CrudRepository<Parametrizar, Integer> {
	//busquesa por el codigo de producto
	

}
