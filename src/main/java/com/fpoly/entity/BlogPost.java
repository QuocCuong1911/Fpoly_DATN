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
@Table(name = "BlogPosts")
public class BlogPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PostID;

	@Column(name = "Title", nullable = false, length = 255)
	private String Title;

	@Column(name = "Content", columnDefinition = "TEXT")
	private String Content;

	@Column(name = "PublishDate")
	private Date PublishDate;

	@ManyToOne
	@JoinColumn(name = "UserID")
	private User user;
}
