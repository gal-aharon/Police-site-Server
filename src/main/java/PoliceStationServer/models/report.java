package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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

    @Column(name="reporter_id")
    @JsonProperty
    private String reporter;

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

    public report() {
    }

    public report(report r) {
        this.evType = r.getEvType();
        this.evTime = r.getEvTime();
        this.evReportTime = r.getEvReportTime();
        this.reporter = r.getReporter();
        this.reportId = r.getReportId();
        this.evLocationX = r.getEvLocationX();
        this.evLocationY = r.getEvLocationY();
        this.evArea = r.getEvArea();
    }

    public String getEvType() {
        return evType;
    }

    public String getEvTime() {
        return evTime;
    }

    public String getEvReportTime() {
        return evReportTime;
    }

    public String getReporter() {
        return reporter;
    }

    public String getReportId() {
        return reportId;
    }

    public Double getEvLocationX() {
        return evLocationX;
    }

    public Double getEvLocationY() {
        return evLocationY;
    }

    public String getEvArea() {
        return evArea;
    }
}
