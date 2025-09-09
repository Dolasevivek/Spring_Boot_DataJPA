package com.vk.service;

import com.vk.entity.Doctor;

public interface iDoctorMgmtService {

	public String  registerDoctor(Doctor doctor);
	public String registerDoctorsGroup(Iterable<Doctor>list);
}
