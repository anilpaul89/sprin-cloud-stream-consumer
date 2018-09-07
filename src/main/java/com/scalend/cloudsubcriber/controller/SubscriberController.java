package com.scalend.cloudsubcriber.controller;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.scalend.cloudsubcriber.TestRequest;

public class SubscriberController {

	@StreamListener(target = Sink.INPUT)
	public void processRegisterEmployees(TestRequest employee) {
		System.out.println("Test Request Recieved " + employee);
	}
}
