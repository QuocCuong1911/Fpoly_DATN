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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "RefundGuidelines")
public class RefundGuidelines {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ProductID;

	@ManyToOne
	@JoinColumn(name = "Product")
	private Product product;

	@Column(name = "Time")
	private Float Time;

	@Column(name = "ReturnPolicy", columnDefinition = "NVARCHAR(255)")
	private String ReturnPolicy;
}
