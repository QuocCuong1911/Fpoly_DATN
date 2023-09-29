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
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductID;

    @Column(name = "Name", nullable = false, length = 255)
    private String Name;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String Description;

    @Column(name = "Price")
    private double Price;

    @Column(name = "Quantity")
    private Integer Quantity;

    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category category;

}
