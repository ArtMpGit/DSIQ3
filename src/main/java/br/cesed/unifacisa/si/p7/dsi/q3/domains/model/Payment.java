package br.cesed.unifacisa.si.p7.dsi.q3.domains.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private LocalDate date;
	
	private Boolean isPaid;
	
	private Boolean isConfirmed;
	
	private LocalDate expireDate;
	
	private Boolean paidFull;
	
	private String requester;

	public Payment(Long id, LocalDate date, Boolean isPaid, Boolean isConfirmed, LocalDate expireDate, Boolean paidFull,
			String requester) {
		this.id = id;
		this.date = date;
		this.isPaid = isPaid;
		this.isConfirmed = isConfirmed;
		this.expireDate = expireDate;
		this.paidFull = paidFull;
		this.requester = requester;
	}
	
	public Payment() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Boolean getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Boolean getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public Boolean getPaidFull() {
		return paidFull;
	}

	public void setPaidFull(Boolean paidFull) {
		this.paidFull = paidFull;
	}

	public String getRequester() {
		return requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}
	
	
	
	

}
