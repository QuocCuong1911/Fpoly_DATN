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

	@JsonIgnore
	@OneToMany(mappedBy = "user",  fetch = FetchType.EAGER)
	List<Authority> authorities;

	@JsonIgnore
	@OneToMany(mappedBy = "user")
	List<Order> orders;


}
