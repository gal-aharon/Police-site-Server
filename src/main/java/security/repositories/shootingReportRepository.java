package security.repositories;


import security.models.report;
import security.models.shootingReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface shootingReportRepository extends JpaRepository<shootingReport, String> {
}

