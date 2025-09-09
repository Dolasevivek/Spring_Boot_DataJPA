package com.vk.repository;

import org.springframework.data.repository.CrudRepository;

import com.vk.entity.Doctor;

public interface iDoctorRepository extends CrudRepository<Doctor, Integer> {

}
