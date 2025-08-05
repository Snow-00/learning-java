package com.myjava.learning;

import com.myjava.javapack.Company;

public class CompanyApp {
    public static void companyMain(String[] args) {
        Company company = new Company();
        company.setName("Programmer");

        Company.Employee employee = company.new Employee();
        employee.setName("Heeh");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
