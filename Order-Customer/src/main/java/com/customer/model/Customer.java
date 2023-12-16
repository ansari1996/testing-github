package com.customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
	
	@Id
	@Getter @Setter private Integer custId;
	@Getter @Setter private String custName;
	@Getter @Setter private String city;

}
