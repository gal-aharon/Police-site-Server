package PoliceStationServer.models;

public class GeneralReport {
    private report rep;
    private accidentReport accidentRep;
    private stabbingReport stabbingReport;
    private shootingReport shootingReport;
    private kidnapReport kidnappingReport;

    private int report_id;

    public report getRep() {
        return rep;
    }

    public accidentReport getAccidentRep() {
        return accidentRep;
    }

    public PoliceStationServer.models.stabbingReport getStabbingReport() {
        return stabbingReport;
    }

    public PoliceStationServer.models.shootingReport getShootingReport() {
        return shootingReport;
    }

    public kidnapReport getKidnappingReport() {
        return kidnappingReport;
    }
}
