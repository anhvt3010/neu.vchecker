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
@Table(name = "production_lot", schema = "vchecker")
public class ProductionLotEntity extends AbstractAuditingEntity<String> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String lotCode;

    private String name;

    private Integer productId;

    private Integer farm;

    private Integer areaId;

    private String productionCycle;

    private LocalDate plantedDate;

    private LocalDate estimatedHarvestDate;

    private LocalDate actualHarvestDate;

    private BigDecimal plantedArea;

    private BigDecimal expectedYield;

    private BigDecimal actualYield;

    private String status;

    private String blockchainHash;

    private Boolean isDeleted;
}
