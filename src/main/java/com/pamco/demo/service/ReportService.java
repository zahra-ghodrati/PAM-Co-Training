package com.pamco.demo.service;

import com.pamco.demo.model.DepartmentModel;
import com.pamco.demo.model.ReportModel;
import com.pamco.demo.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReportService {
    @Autowired
    private ReportRepository reportRepository;

    public List<ReportModel> findResult(int departmentId) {
        return reportRepository.saleReportByDepartment(departmentId);
    }
}
