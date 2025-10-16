package com.anhvt.prj.vchecker.entity.admin;

import com.anhvt.prj.vchecker.entity.common.AbstractAuditingEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lot_process_log", schema = "vchecker")
public class LotProcessLogEntity extends AbstractAuditingEntity<String> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer lotId;

    private LocalDateTime logTime;

    private String workType;

    private String description;

    private String performedBy;

    private Integer performedPartner;

    private String location;

    private String weatherInfo;

    private String attachments;
}
