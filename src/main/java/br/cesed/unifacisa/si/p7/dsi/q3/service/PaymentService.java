package br.cesed.unifacisa.si.p7.dsi.q3.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.unifacisa.si.p7.dsi.q3.domains.model.Payment;
import br.cesed.unifacisa.si.p7.dsi.q3.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	
	public Payment create(Payment payment) {
		return paymentRepository.save(payment);
	}
	
	public List<Payment> getAll(){
		return paymentRepository.findAll();
	}
	
	@Transactional
	public Payment getById(Long id) {
		return paymentRepository.findById(id).orElseThrow(()-> new RuntimeException());
	}
	
	@Transactional
	public Payment update(Long id,Payment newInfoPayment) {
		Payment payment = getById(id);
		payment.setDate(newInfoPayment.getDate());
		payment.setExpireDate(newInfoPayment.getExpireDate());
		payment.setIsConfirmed(newInfoPayment.getIsConfirmed());
		payment.setIsPaid(newInfoPayment.getIsPaid());
		payment.setPaidFull(newInfoPayment.getPaidFull());
		payment.setRequester(newInfoPayment.getRequester());
		return payment;
	}
	
	public Payment getByRequester(String requester) {
		return paymentRepository.findByRequester(requester);
	}
	
	public void delete(Long id) {
		paymentRepository.deleteById(id);
	}
	

}
