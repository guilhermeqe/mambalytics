package com.mamba.mambalyticsapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "CONTRACT")
public class ContractEntity {

    @Id
    private Long id;

    private UUID contractId;

    private String name;

    private String subscriberName;

    private String subscriberEmail;

    private String subscriberDocument;

    private String lastStatus;

    private Integer chargesStatus;

    private Integer chargedEveryDays;

    private String paymentMethod;

    private LocalDateTime startedAt;

    private String cancelReason;

    private String canceledByName;

    private String canceledByEmail;

    private boolean cancelAtCycleEnd;

    private LocalDateTime dateLastStatusAt;

    private LocalDateTime dateCanceledAt;

    private LocalDate cycleStartDate;

    private LocalDate cycleEndDate;

    private LocalDate nextCycleStartDateAt;

    private UUID subscriberId;

    private String subscriberPhoneNumber;

    private String subscriberPhoneLocalCOde;

    private String address;

    private String addressNumber;

    private String addressComplement;

    private String addressDistrict;

    private String addressCity;

    private String addressCountry;

}
