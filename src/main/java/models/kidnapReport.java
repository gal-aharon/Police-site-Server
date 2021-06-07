package main.java.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class kidnapReport {

    @Column(name="kidnapper_id")
    @JsonProperty
    private String kidnapperID;

    @Column(name="last_place_known")
    @JsonProperty
    private String lastPlace;

    @Id
    @ManyToOne
    @JoinColumn(name = "report_id")
    @Column(name="report_id")
    @JsonProperty
    private report report;

    @Column(name="kidnapped_id")
    @JsonProperty
    private Integer kidnappedId;
}