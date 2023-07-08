package com.app.entities;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table
public class Railway extends BaseEntity {
	
	@Column(length = 30, nullable = false)
	private String name;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(nullable = false)
	private LocalTime startTime;
	@Column(nullable = false)
	private LocalTime endTime;
	@Column(length = 30, nullable = false)
	private String source;
	@Column(length = 30, nullable = false)
	private String destination;
	@Column(nullable = false)
	private double distance;
	@Column(nullable = false)
	private int frequency;
	
	public Railway() {
		super();
	}
	public Railway(String name, Category category, LocalTime startTime, LocalTime endTime, String source,
			String destination, double distance, int frequency) {
		super();
		this.name = name;
		this.category = category;
		this.startTime = startTime;
		this.endTime = endTime;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.frequency = frequency;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
}
