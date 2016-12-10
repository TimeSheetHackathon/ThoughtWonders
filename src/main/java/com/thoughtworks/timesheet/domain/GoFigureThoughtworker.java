package com.thoughtworks.timesheet.domain;

import java.util.ArrayList;

/**
 * Created by mritunjd on 10/12/16.
 */
public class GoFigureThoughtworker {
    private String role;
    private String homeOffice;
    private String projectName;
    private String name;
    private String accountName;
    private String grade;
    private String id;
    private String weekend;
    private String country;
    private String staffingOffice;
    private String workingOffice;

    public GoFigureThoughtworker() {

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHomeOffice() {
        return homeOffice;
    }

    public void setHomeOffice(String homeOffice) {
        this.homeOffice = homeOffice;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStaffingOffice() {
        return staffingOffice;
    }

    public void setStaffingOffice(String staffingOffice) {
        this.staffingOffice = staffingOffice;
    }

    public String getWorkingOffice() {
        return workingOffice;
    }

    public void setWorkingOffice(String workingOffice) {
        this.workingOffice = workingOffice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoFigureThoughtworker that = (GoFigureThoughtworker) o;

        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (homeOffice != null ? !homeOffice.equals(that.homeOffice) : that.homeOffice != null) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (accountName != null ? !accountName.equals(that.accountName) : that.accountName != null) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (weekend != null ? !weekend.equals(that.weekend) : that.weekend != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (staffingOffice != null ? !staffingOffice.equals(that.staffingOffice) : that.staffingOffice != null)
            return false;
        return workingOffice != null ? workingOffice.equals(that.workingOffice) : that.workingOffice == null;
    }

    @Override
    public int hashCode() {
        int result = role != null ? role.hashCode() : 0;
        result = 31 * result + (homeOffice != null ? homeOffice.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (weekend != null ? weekend.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (staffingOffice != null ? staffingOffice.hashCode() : 0);
        result = 31 * result + (workingOffice != null ? workingOffice.hashCode() : 0);
        return result;
    }
}
