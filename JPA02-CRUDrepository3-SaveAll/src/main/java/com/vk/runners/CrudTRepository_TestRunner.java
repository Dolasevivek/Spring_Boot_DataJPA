package com.vk.runners;

import java.util.List;

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
	
		/*try {
			
			//  prepare doctor object
			Doctor doc=new Doctor("Ankush","MD",700000L,5688776655L,"Cardio");

			String msg = docservice.registerDoctor(doc);
			System.out.println(msg);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
*/
		try {
			
			  Doctor dr1=new Doctor("Ramesh","Ms",900000L,1122334455L,"Nuero");
			  Doctor dr2=new Doctor("Jack","BAMS",900000L,2322334455L,"Family");
			  Doctor dr3=new Doctor("Lakhan","MBBS",78000L,1112334455L,"Ortho");
			  
			  
			  List<Doctor> list = List.of(dr1,dr2,dr3);
			  String  msg = docservice.registerDoctorsGroup(list);
			  System.out.println(msg);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
