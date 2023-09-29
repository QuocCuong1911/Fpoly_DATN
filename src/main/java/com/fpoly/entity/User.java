package com.fpoly.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name ="Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserID;
	
	@Column(name ="Username", nullable = false, columnDefinition = "NVARCHAR(100)")
	private String Username;
	
	@Column(name ="Password", nullable = false, columnDefinition = "NVARCHAR(80)")
	private String Password;
	
	@Column(name ="Gender", nullable = false, columnDefinition = "bit")
	private Boolean Gender;
	
	@Column(name ="Email", nullable = false, columnDefinition = "VARCHAR(50)")
	private String Email;
	
	@Column(name ="PhoneNumber", nullable = false, columnDefinition = "VARCHAR(13)")
	private String  PhoneNumber;
	
	
}
