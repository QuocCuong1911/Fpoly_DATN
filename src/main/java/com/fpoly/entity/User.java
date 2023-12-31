package com.fpoly.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserID;

	@Column(name ="Name", nullable = false, columnDefinition = "NVARCHAR(20)")
	private String Name;

	@Column(name ="SurName", nullable = false, columnDefinition = "NVARCHAR(30)")
	private String SurName;

	@Column(name ="Password", nullable = false, columnDefinition = "NVARCHAR(80)")
	private String Password;

	@Column(name ="HomeTown", columnDefinition = "NVARCHAR(80)") //quê quán nhập hay ko nhập điều đc
	private String HomeTown;

	@Column(name ="Residential_address", columnDefinition = "NVARCHAR(80)") //địa chỉ thường trú cho nhân viên
	private String Residential_address;

	@Column(name ="Delivery_address", columnDefinition = "VARCHAR(80)") //địa chỉ giao hàng cho shipper mặc ịnh
	private String Delivery_address;

	@Column(name ="IdCard", columnDefinition = "VARCHAR(13)")
	private String IdCard;

	@Column(name ="Date")
	private Date DateOfBirth;

	@Column(name ="Gender", nullable = false, columnDefinition = "bit")
	private Boolean Gender;
	
	@Column(name ="Email", nullable = false, columnDefinition = "VARCHAR(50)")
	private String Email;

	@Column(name ="PhoneNumber", nullable = false, columnDefinition = "VARCHAR(13)")
	private String  PhoneNumber;

	@JsonIgnore
	@OneToMany(mappedBy = "user",  fetch = FetchType.EAGER)
	List<Authority> authorities;

	@JsonIgnore
	@OneToMany(mappedBy = "user")
	List<Order> orders;


}
