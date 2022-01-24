package com.company.AnnoIlus;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component


public class Snapdragon implements Processor {

	public void process() {

		System.out.println("I am i.e. Snapdragon is the worlds best Processor");

	}

}
