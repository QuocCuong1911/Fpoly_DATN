package com.fpoly.entity;





import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImage;



}
