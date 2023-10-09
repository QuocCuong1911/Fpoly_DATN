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
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Banners")
public class Banner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BannerID;

	@Column(name = "ImageURL", nullable = false, length = 255)
	private String ImageURL;

	@Column(name = "Caption",  columnDefinition = "nvarchar(max)")
	private String Caption;

	@Column(name = "Order")
	private int Order;

	@Column(name = "CreatedAt")
	private Date CreatedAt;

	@ManyToOne
	@JoinColumn(name = "UserID")
	private User user;
}
