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
@Table(name = "warehouse_transaction", schema = "vchecker")
public class WarehouseTransactionEntity extends AbstractAuditingEntity<String> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String transactionCode;

    private Integer lotId;

    private Integer productId;

    private Integer warehouseFromId;

    private Integer warehouseToId;

    private Integer partnerId;

    private String warehouseType;

    private String type; // nhập kho, xuất kho, chuyển kho, hủy,...

    private BigDecimal quantity;

    private String unit;

    private LocalDate transactionDate;

    private String referenceDoc;
}