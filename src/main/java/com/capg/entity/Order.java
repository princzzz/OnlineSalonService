package com.capg.entity;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;
	private double amount;
	private LocalDate billingDate;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Customer customer;
	private String paymentMethod;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(long orderId, double amount, LocalDate billingDate, Customer customer, String paymentMethod) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.billingDate = billingDate;
		this.customer = customer;
		this.paymentMethod = paymentMethod;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", billingDate=" + billingDate + ", customer="
				+ customer + ", paymentMethod=" + paymentMethod + "]";
	}
	
	
}
