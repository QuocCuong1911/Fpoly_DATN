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
@Table(name = "ProductSizes")
public class ProductSize {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SizeID;

    @ManyToOne
    @JoinColumn(name = "ProductID")
    private Product product;

    @Column(name = "SizeName", length = 50)
    private String SizeName;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "Available")
    private Boolean Available;

}
