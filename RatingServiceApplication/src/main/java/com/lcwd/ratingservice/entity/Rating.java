package com.lcwd.ratingservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table (name = "rating_service")
public class Rating {
	@Id
	@Column(name = "ratingid")
	private String ratingId;
	@Column(name = "userid")
	private String userId;
	@Column(name = "rating")
	private int rating;
	@Column(name = "hotelid")
	private String hotelId;
	@Column(name ="feedback")
	private String feedback;

}