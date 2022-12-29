package com.trackmed.tmhospital.domains.models;

import com.trackmed.tmhospital.domains.enums.Speciality;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class RegulatoryMedicBodyModel {

    private UUID id;
    private String medicName;
    private String medicLastName;
    private Date registrationDate;
    private Date expirationDate;
    private boolean enabled;
    private Speciality speciality;
}