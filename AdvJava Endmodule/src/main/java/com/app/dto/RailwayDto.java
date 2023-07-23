package com.app.dto;

import java.time.LocalDateTime;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.entities.Category;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Valid
public class RailwayDto {
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	@NotBlank(message = "name cannot be blank")
	private String name;
	@NotNull(message = "Must select a category")
	private Category category;
	@NotNull(message = "Must select a date") 
	private LocalDateTime Start_time;
	@NotNull(message = "Must select a date")
	private LocalDateTime End_time;
	@NotBlank(message = "Source cannot be blank")
	private String Source;
	@NotBlank(message = "destination cannot be blank")
	private String Destination;
	@Min(value = 1,message = "Must be greater than 0 ")
	private double distance;
	@Min(value = 1,message = "Must be greater than 0")
	private int frequency;
}
