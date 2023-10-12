package com.lcwd.gateway.models;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthResponse {
	 
	private String userIdString;
	private String accessToken;
	private String refreshToken;
	private long expireAt;
	private  Collection<String> authorities;
	
}
