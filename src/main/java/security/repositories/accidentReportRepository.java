package security.repositories;


import security.models.accidentReport;
import security.models.report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accidentReportRepository extends JpaRepository<accidentReport, String> {
}

