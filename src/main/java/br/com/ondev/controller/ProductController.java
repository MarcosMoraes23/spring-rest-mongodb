package br.com.ondev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ondev.dto.BasicResponseDTO;
import br.com.ondev.enums.EBusinessCode;
import br.com.ondev.exception.ValidacaoException;
import br.com.ondev.model.Product;
import br.com.ondev.service.ProductService;

@RestController("products")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Product entity) {
		try {
			return new ResponseEntity<BasicResponseDTO>
			(BasicResponseDTO.createResponse(EBusinessCode.SUCESSO, service.save(entity)), HttpStatus.OK);
		} catch (ValidacaoException e) {
			return new ResponseEntity<BasicResponseDTO>(e.getBasicResponse(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	public ResponseEntity<?> findAll() {
		try {
			return new ResponseEntity<BasicResponseDTO>
			(BasicResponseDTO.createResponse(EBusinessCode.SUCESSO,  service.findAll()), HttpStatus.OK);
		} catch (ValidacaoException e) {
			return new ResponseEntity<BasicResponseDTO>(e.getBasicResponse(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/One/{id}")
	public ResponseEntity<?> findOne(@PathVariable("id") String id) {
		try {
			return new ResponseEntity<BasicResponseDTO>
			(BasicResponseDTO.createResponse(EBusinessCode.SUCESSO, service.findOne(id)), HttpStatus.OK);
		} catch (ValidacaoException e) {
			return new ResponseEntity<BasicResponseDTO>(e.getBasicResponse(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Product entity) {
		try {
			service.delete(entity);
			return new ResponseEntity<BasicResponseDTO>(BasicResponseDTO.createResponse(EBusinessCode.SUCESSO, entity), HttpStatus.OK);
		} catch (ValidacaoException e) {
			return new ResponseEntity<BasicResponseDTO>(e.getBasicResponse(), HttpStatus.NOT_FOUND);
		}
	}

}
