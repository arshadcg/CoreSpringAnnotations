package com.company.AnnoIlus;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component	
@Primary

public class Faltuprocessor implements Processor {

	public void process() {

		System.out.println("I am worlds not best and not faltu processor iam 'OK processor'");

	}

}
