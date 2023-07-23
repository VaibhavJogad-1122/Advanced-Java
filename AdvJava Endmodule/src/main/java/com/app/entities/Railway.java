package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Railways")
public class Railway {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(length = 30, nullable = false)
	private String name;
	@Enumerated(EnumType.STRING)
	private Category category;
	private LocalDateTime Start_time;
	private LocalDateTime End_time;
	@Column(length = 30, nullable = false)
	private String Source;
	@Column(length = 30, nullable = false)
	private String Destination;
	private double distance;
	private int frequency;

	@Override
	public String toString() {
		return "Railway [name=" + name + ", category=" + category + ", Start_time=" + Start_time + ", End_time="
				+ End_time + ", Source=" + Source + ", Destination=" + Destination + ", distance=" + distance + "]";
	}

}
