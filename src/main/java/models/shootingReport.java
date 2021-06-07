package main.java.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class shootingReport {

    @Column(name="weapon_type")
    @JsonProperty
    private String weaponType;

    @Column(name="casualties_num")
    @JsonProperty
    private Integer casualtiesNum;

    @Id
    @ManyToOne
    @JoinColumn(name = "report_id")
    @Column(name="report_id")
    @JsonProperty
    private report report;

    @Column(name="shooter_id")
    @JsonProperty
    private String shooterId;
    
}
