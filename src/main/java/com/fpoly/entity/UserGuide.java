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
@Table(name = "UserGuide")
public class UserGuide {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserGuideID;
	
	 @ManyToOne
	    @JoinColumn(name = "ProductID")
	    private Product product;

	    @Column(name = "UserManual", columnDefinition = "NVARCHAR(255)")
	    private String UserManual;
}
