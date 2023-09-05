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
@Entity
@Table(name = "GuaranteeDetails")
@AllArgsConstructor
@NoArgsConstructor
public class GuaranteeDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int GuaranteeDetailsIDd;
	
	@ManyToOne
    @JoinColumn(name = "ProductID")
    private Product product;

    @Column(name = "Time")
    private Float Time;

    @Column(name = "GuaranteePolicy", columnDefinition = "NVARCHAR(255)")
    private String GuaranteePolicy;
}
