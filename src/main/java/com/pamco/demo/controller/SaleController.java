package com.pamco.demo.controller;

import com.pamco.demo.model.SalesModel;
import com.pamco.demo.service.SaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/sales")

public class SaleController {
    @Autowired
    private SaleServiceImpl saleService;
    @Autowired
    HttpServletRequest request;


    @GetMapping("/factor")
    public String showForm(Model model) {
        return "saleFacorForm";

    }

    @PostMapping("/factor")
    public String saveFactor(Model model) {
        SalesModel salesModel = new SalesModel();
        salesModel.setQty(Integer.parseInt(request.getParameter("qty")));
        salesModel.setPersonID(Integer.parseInt(request.getParameter("person")));
        salesModel.setProductID(Integer.parseInt(request.getParameter("product")));

        saleService.createSaleFactor(salesModel);
        model.addAttribute("model", salesModel);
        return "saveSuccessful";

    }


}
