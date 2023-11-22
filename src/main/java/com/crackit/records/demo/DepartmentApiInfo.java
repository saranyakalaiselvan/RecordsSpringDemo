package com.crackit.records.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "department")
public record DepartmentApiInfo(String url, String clientId, String secret) {
}
