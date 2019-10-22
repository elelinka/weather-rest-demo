package com.example.weatherrestdemo.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class LoggingInterceptor implements ClientHttpRequestInterceptor {

    private final Logger LOGGER = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes, ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
        LOGGER.info("Uri: {}", httpRequest.getURI());

        LOGGER.warn("Method: {}", httpRequest.getMethod());
        LOGGER.error("Bytes: {}", new String(bytes));

        ClientHttpResponse response = clientHttpRequestExecution.execute(httpRequest, bytes);

        LOGGER.info("Response status code: {}", response.getStatusCode());
        LOGGER.info("Response body: {}", response.getBody());

        return response;
    }
}
