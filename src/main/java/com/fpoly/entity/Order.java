package com.fpoly.entity;
import java.util.Date;

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
@Table(name = "Orders")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private User user;

    @Column(name = "OrderDate")
    private Date OrderDate;

    @Column(name = "Status")
    private boolean Status;

    @Column(name = "TotalAmount"/*, precision = 10, scale = 2*/)
    private double TotalAmount;

    @ManyToOne
    @JoinColumn(name = "voucherId")
    private Voucher voucher; // Trường này để lưu mã voucher áp dụng cho đơn hàng
}
