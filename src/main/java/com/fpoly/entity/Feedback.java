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
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Feedback")
public class Feedback {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int FeedbackID;

    @Column(name = "Title", columnDefinition = "nvarchar(max)")
    private String Title;

    @Column(name = "Mail",columnDefinition = "varchar(50)")
    private String Mail;

    @Column(name = "Message", columnDefinition = "nvarchar(max)")
    private String Message;

    @Column(name = "Date")
    private Date Date;
}
