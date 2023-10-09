package com.fpoly.entity;

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
@Table(name = "FavoriteProducts")
public class FavoriteProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int FavoriteProductID;

	@ManyToOne
	@JoinColumn(name = "ProductID")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "UserID")
	private User user;
}
