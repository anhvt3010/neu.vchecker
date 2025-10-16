package com.anhvt.prj.vchecker.entity.admin;

import com.anhvt.prj.vchecker.entity.common.AbstractAuditingEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "partner", schema = "vchecker")
public class PartnerEntity extends AbstractAuditingEntity<String> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String name;

    private String typeCode;

    private String contactPerson;

    private String phone;

    private String email;

    private String address;

    private String taxId;

    private String contractRef;

    private String status;
}
