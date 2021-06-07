package main.java.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.catalina.User;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class accidentReport {

    @Column(name="hitter_id")
    @JsonProperty
    private String hitterID;

    @Column(name="hit_id")
    @JsonProperty
    private String hitId;

    @Column(name="casualties_num")
    @JsonProperty
    private Integer casualtiesNum;

    @Id
    @ManyToOne
    @JoinColumn(name = "report_id")
    @Column(name="report_id")
    @JsonProperty
    private report report;
}
