package com.trackmed.tmhospital.domains.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trackmed.tmhospital.domains.enums.Speciality;
import com.trackmed.tmhospital.domains.model.Hospital;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "HOS_T_MEDIC")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Medic implements Serializable {
    public static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "medic_id")
    private UUID id;

    @Column(name = "hospital_id", nullable = false)
    private UUID hospital;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date birthDate;

    @Column(nullable = false)
    private String cpf;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

//    @ManyToMany(fetch = FetchType.EAGER)
//    private List<UUID> listRegulatoryMedicBody;
//
//    private List<Speciality> specialities;

    public Medic(UUID hospital, String name, String lastName, Date birthDate, String cpf, String email,
                 String username, String password, List<UUID> listRegulatoryMedicBody,
                 List<Speciality> specialities) {
        this.hospital = hospital;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.cpf = cpf;
        this.email = email;
        this.username = username;
        this.password = password;
//        this.listRegulatoryMedicBody = listRegulatoryMedicBody == null ? new ArrayList<>() : listRegulatoryMedicBody;
//        this.specialities = specialities == null ? new ArrayList<>() : specialities;
    }
}
