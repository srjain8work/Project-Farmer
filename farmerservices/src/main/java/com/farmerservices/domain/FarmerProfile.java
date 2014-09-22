package com.farmerservices.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class FarmerProfile {
	private @NonNull Double mobile_number;
	private @NonNull String name;
	private Integer age;
}
