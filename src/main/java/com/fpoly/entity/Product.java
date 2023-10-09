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

    @Column(name = "Name", nullable = false, columnDefinition = "nvarchar(max)")
    private String Name;

    //Mô tả
    @Column(name = "Description", columnDefinition = "nvarchar(max)")
    private String Description;

    @Column(name = "Price")
    private double Price;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "Product_information", columnDefinition = "nvarchar(max)")
    private String Product_information;

    //Thời gian bảo hành
    @Column(name ="warranty_period")
    private double Parranty_period;

    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category category;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImage;



}
