package com.fiskra.spring.io.rest.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.fiskra.spring.io.rest.client.model.Direction;

/**
 * Thic class represents to start spring boot application 
 *
 */
@SpringBootApplication
public class Application 
{
	public static final Logger log = LoggerFactory.getLogger(Application.class);
    public static void main( String[] args )
    {
    	RestTemplate restTemplate = new RestTemplate();
        Direction direct = restTemplate.getForObject("http://localhost:8088/api/direct?dep_sid=138&arr_sid=148", Direction.class);
        log.info(direct.toString());
    }
}
