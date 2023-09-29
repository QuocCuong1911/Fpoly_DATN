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
@Table(name = "PopularProducts")
public class PopularProduct {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PopularProductID;
	
	@ManyToOne
	@JoinColumn(name = "product")
	private Product product;

	@Column(name = "NumberOfPurchases")
	private int NumberOfPurchases;
}
