package main.java.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table(name="report")
public class report {

    @Column(name="ev_type")
    @JsonProperty
    private String evType;

    @Column(name="ev_time")
    @JsonProperty
    private String evTime;

    @Column(name="ev_report_time")
    @JsonProperty
    private String evReportTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Column(name="reporter_id")
    @JsonProperty
    private User reporter;

    @Id
    @Column(name="report_id")
    @JsonProperty
    private String reportId;

    @Column(name="ev_loc_x")
    @JsonProperty
    private Double evLocationX;

    @Column(name="ev_loc_y")
    @JsonProperty
    private Double evLocationY;

    @Column(name="ev_area")
    @JsonProperty
    private String evArea;
}
