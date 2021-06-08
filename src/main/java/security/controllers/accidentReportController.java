package security.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.models.accidentReport;
import security.services.accidentReportService;

import java.util.List;

@RestController
@RequestMapping("/accident")
public class accidentReportController {
    @Autowired
    security.services.accidentReportService accidentReportService;

    @GetMapping("")
    public List<accidentReport> getAll() {
        return accidentReportService.getAll();
    }
}
