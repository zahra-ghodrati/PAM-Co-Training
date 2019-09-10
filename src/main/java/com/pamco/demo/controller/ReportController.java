package com.pamco.demo.controller;

import com.pamco.demo.model.ReportModel;
import com.pamco.demo.model.SalesModel;
import com.pamco.demo.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/perDepartment")
    public String showForm(Model model) {
        return "SalesReport";

    }

    @PostMapping("/perDepartment")
    public String showReport(Model model) {
        int departmentId = Integer.parseInt(request.getParameter("department"));
        List<ReportModel> reportModels = reportService.findResult(departmentId);
        model.addAttribute("reportModels", reportModels);
        return "ReportResult";

    }
}
