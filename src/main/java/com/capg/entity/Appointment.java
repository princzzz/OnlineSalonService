package com.capg.entity;
import java.time.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private long appointmentId;
	private String location;
	private String visitType;
	private LocalDate prefferedDate;
	private LocalTime prefferdTime;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "serviceName")
	private String serviceName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paymentId")
	private Payment payment;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(long appointmentId, String location, String visitType, LocalDate prefferedDate,
			LocalTime prefferdTime, String serviceName, Customer customer, Payment payment) {
		super();
		this.appointmentId = appointmentId;
		this.location = location;
		this.visitType = visitType;
		this.prefferedDate = prefferedDate;
		this.prefferdTime = prefferdTime;
		
		this.serviceName = serviceName;
		this.customer = customer;
		this.payment = payment;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getVisitType() {
		return visitType;
	}
	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}
	public LocalDate getPrefferedDate() {
		return prefferedDate;
	}
	public void setPrefferedDate(LocalDate prefferedDate) {
		this.prefferedDate = prefferedDate;
	}
	public LocalTime getPrefferdTime() {
		return prefferdTime;
	}
	public void setPrefferdTime(LocalTime prefferdTime) {
		this.prefferdTime = prefferdTime;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", location=" + location + ", visitType=" + visitType
				+ ", prefferedDate=" + prefferedDate + ", prefferdTime=" + prefferdTime + ", serviceName=" + serviceName
				+ ", customer=" + customer + "]";
	}
	
	
	
}
