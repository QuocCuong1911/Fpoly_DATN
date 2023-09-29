package com.fpoly.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OrderDetail")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrderItemID;

	@ManyToOne
	@JoinColumn(name = "OrderID")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "ProductID")
	private Product Product;

	@Column(name = "Quantity")
	private Integer Quantity;

	@Column(name = "Subtotal"/*, precision = 10, scale = 2*/)
	private double Subtotal;
}
