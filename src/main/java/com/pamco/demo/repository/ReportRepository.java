package com.pamco.demo.repository;

import com.pamco.demo.model.ReportModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<ReportModel> saleReportByDepartment(int departmentId) {
        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("departmentId", departmentId);

        String sql = " select  " +
                " DEP.NAME as departmentName, " +
                " PER.NAME as personName, " +
                " PRO.NAME as productName, " +
                " PRO.PRICE as price," +
                " SAL.QTY as qty " +
                " from " +
                "   TB_SALES SAL JOIN TB_PRODUCTS PRO ON SAL.PRO_ID = PRO.ID " +
                "   JOIN TB_PERSONS PER ON SAL.PER_ID = PER.ID " +
                "   JOIN TB_DEPARTMENTS DEP ON PER.DEP_ID = DEP.ID " +
                " where DEP.ID = :departmentId";
        return jdbcTemplate.query(sql, parameters, new BeanPropertyRowMapper(ReportModel.class));
    }
}
