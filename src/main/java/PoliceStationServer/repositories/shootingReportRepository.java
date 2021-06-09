package PoliceStationServer.repositories;


import PoliceStationServer.models.shootingReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface shootingReportRepository extends JpaRepository<shootingReport, String> {
    shootingReport findByReport(String ReportId);
}

