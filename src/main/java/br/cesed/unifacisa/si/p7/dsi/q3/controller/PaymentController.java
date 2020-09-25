package br.cesed.unifacisa.si.p7.dsi.q3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.si.p7.dsi.q3.domains.model.Payment;
import br.cesed.unifacisa.si.p7.dsi.q3.service.PaymentService;

@RestController
@RequestMapping("payments")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	
	@PostMapping
	public ResponseEntity<Payment> create(@RequestBody Payment payment){
		return new ResponseEntity<>(paymentService.create(payment),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Payment>> getAll(){
		return new ResponseEntity<>(paymentService.getAll(),HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Payment> getById(@PathVariable Long id){
		return new ResponseEntity<>(paymentService.getById(id),HttpStatus.OK);
	}
	
	@GetMapping("search")
	public ResponseEntity<Payment> getByRequester(String requester){
		return new ResponseEntity<>(paymentService.getByRequester(requester),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Payment> update(@PathVariable Long id,@RequestBody Payment payment){
		return new ResponseEntity<>(paymentService.update(id, payment),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		paymentService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
