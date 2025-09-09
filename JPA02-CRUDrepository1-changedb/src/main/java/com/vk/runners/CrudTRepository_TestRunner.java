package com.vk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vk.entity.Doctor;
import com.vk.service.iDoctorMgmtService;
@Component
public class CrudTRepository_TestRunner implements CommandLineRunner {
    @Autowired
	private iDoctorMgmtService docservice;
	@Override
	public void run(String... args) throws Exception {
	
		try {
			
			//  prepare doctor object
			Doctor doc=new Doctor("Ankush","MD",700000L,5688776655L,"Cardio");

			String msg = docservice.registerDoctor(doc);
			System.out.println(msg);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
