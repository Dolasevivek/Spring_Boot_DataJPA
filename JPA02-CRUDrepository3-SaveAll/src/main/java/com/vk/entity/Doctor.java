package com.vk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data

@AllArgsConstructor
@Entity // to mark java bean class as entity class
@Table(name="Doctors")
@RequiredArgsConstructor
public class Doctor {
@Id // to mark property as identity property 
//(generally apply this on the property that is mapped with pk column  of the table )
@Column(name="Doctor_ID")	

//..........................................................................................................................................................................
//@GeneratedValue(strategy=GenerationType.AUTO) 1,2,52
/*@SequenceGenerator(name="gen1",sequenceName="id_SEQUENCE1",initialValue=1000,allocationSize=1)
@GeneratedValue(strategy="gen1",GenerationType.SEQUENCE) starting from 1
*/
@GeneratedValue(strategy=GenerationType.IDENTITY)// it will only work with mysql not with oracle
//...............................................................................................................................................................................
    private Integer id;
@Column(name="Doctor_name",length=30)	
@NonNull
	private String dname;
@Column(name="Doctor_quly",length=30)	
@NonNull
	private String quly;
@Column(name="Doctor_income")	
@NonNull
	private Long income;
@Column(name="Doctor_mobile")	
@NonNull
	private Long mobile;
@Column(name="Doctor_specilization")	
@NonNull
	private String specilization;
	
}
