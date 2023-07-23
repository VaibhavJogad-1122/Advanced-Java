package com.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {
	private String mesg;
	private LocalDateTime time;

	public ApiResponse(String mesg) {
		this.mesg = mesg;
		this.time = LocalDateTime.now();
	}
}
