package br.cesed.unifacisa.si.p7.dsi.q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cesed.unifacisa.si.p7.dsi.q3.domains.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
	
	Payment findByRequester(String requester);
	

}
