package com.vk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.entity.Doctor;
import com.vk.repository.iDoctorRepository;
@Service
public class DoctorMgmtServiceIMPL implements iDoctorMgmtService {
 @Autowired
	private  iDoctorRepository doctorRepo;
	@Override
	public String registerDoctor(Doctor doctor) {
	//  save the Object (insert the object)
		
	     Doctor savedDoctor = doctorRepo.save(doctor);
	     
	     // get generated id value
	         int idVal= savedDoctor.getId();
	         
		return "Doctor Obj is saved with id value ::"+idVal;
	}

}
