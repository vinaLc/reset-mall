package com.paascloud.security.feign;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties(prefix = "paascloud.oauth2.client")
public class Oauth2ClientProperties {
	private String id;
	private String accessTokenUrl;
	private String clientId;
	private String clientSecret;
	private String clientAuthenticationScheme;
}

