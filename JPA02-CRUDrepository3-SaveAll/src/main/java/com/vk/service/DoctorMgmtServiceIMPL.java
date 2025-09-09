package com.vk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.entity.Doctor;
import com.vk.repository.iDoctorRepository;
@Service
public class DoctorMgmtServiceIMPL implements iDoctorMgmtService {
 @Autowired
	private  iDoctorRepository doctorRepo;
 //............................................................. Saving One Record ..............................................................................
	@Override
	public String registerDoctor(Doctor doctor) {
	//  save the Object (insert the object)
		
	     Doctor savedDoctor = doctorRepo.save(doctor);
	     
	     // get generated id value
	         int idVal= savedDoctor.getId();
	         
		return "Doctor Obj is saved with id value ::"+idVal;
	}
//........................................................... Saving multiple Records ..........................................................................................................	
	@Override
	public String registerDoctorsGroup(Iterable<Doctor> list) {
	
		
		System.out.println("DoctorMgmtServiceIMPL.registerDoctorsGroup()");
		        Iterable<Doctor> savedAllDoctors = doctorRepo.saveAll(list);
		        // preparing  list with id values
		        List <Integer>ids=new ArrayList();
		        savedAllDoctors.forEach(dr->{
		        	ids.add(dr.getId());
		        });		        
		        // Returning the message
		return  ids.size()+"No of Doctors are saved witi id values"+ids;
	}

}
