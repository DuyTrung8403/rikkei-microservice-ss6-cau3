package com.rikkei.microservice.doctorservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorRequest {
    private String name;
    private String specialization;
    private Integer experienceYears;
    private String email;
    private Boolean status;
}
