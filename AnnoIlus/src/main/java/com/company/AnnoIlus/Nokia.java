package com.company.AnnoIlus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Nokia {
	
	@Autowired
	Processor cpu;

	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}


	public void config()
	{
		System.out.println("Nokia Android Mode with 8GB RAM and 64GB ROM");
		
		cpu.process();
		
	}

}



