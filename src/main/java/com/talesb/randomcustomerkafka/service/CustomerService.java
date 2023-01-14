package com.talesb.randomcustomerkafka.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {

	public void recieveCustomer() {
		log.info("add here customer info");
	}

	public void produceCustomer(int quantity) {

	}

}
