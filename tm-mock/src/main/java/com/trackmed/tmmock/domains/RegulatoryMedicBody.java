package com.trackmed.tmmock.domains;

import com.trackmed.tmmock.domains.enums.Speciality;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "MOCK_T_REGULATORY_BODY")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RegulatoryMedicBody implements Serializable {
    public static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "regulatory_medic_body_id")
    private UUID id;

    private String medicName;

    private String medicLastName;

    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    private boolean enabled;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Speciality speciality;

    public RegulatoryMedicBody( Speciality speciality) {
        this.speciality = speciality;
    }
}
