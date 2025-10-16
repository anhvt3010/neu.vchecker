package com.anhvt.prj.vchecker.entity.admin;

import com.anhvt.prj.vchecker.entity.common.AbstractAuditingEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lot_material", schema = "vchecker")
public class LotMaterialEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer lotId;

    private Integer logId;

    private Integer materialId;


    private Integer supplierId;

    private BigDecimal quantity;

    private String unit;

    private BigDecimal unitPrice;

    private String currency;

    private LocalDate usedDate;

    private String batchCode;
}