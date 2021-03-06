package com.checkyourluck.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
public class CheckYourLuck {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int serialNumber;
private int givenNumber;
private int randomNumber;
}
