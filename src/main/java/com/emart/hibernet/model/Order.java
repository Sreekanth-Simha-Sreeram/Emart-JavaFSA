package com.emart.hibernet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Buyer")
public class Order {
	@Id
	@Column(name="orderId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int orderId;
	@Column(name="date")
	String date;
	@Column(name="buyerId")
	int buyerId;
}
