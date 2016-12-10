package com.thoughtworks.timesheet.domain;

import java.util.List;

/**
 * Created by vohray on 12/10/16.
 */
public class TimesheetMissedMapping implements Comparable<TimesheetMissedMapping>{
  String employeeId;
  String name;
  List<MissedTimesheet> missedTimesheets;
  int noOfTimesheetsMissed;

  public TimesheetMissedMapping(String employeeId, List<MissedTimesheet> missedTimesheets, int noOfTimesheetsMissed,String name) {
    this.employeeId = employeeId;
    this.name = name;
    this.missedTimesheets = missedTimesheets;
        this.noOfTimesheetsMissed = noOfTimesheetsMissed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof TimesheetMissedMapping)) return false;

    TimesheetMissedMapping that = (TimesheetMissedMapping) o;

    if (noOfTimesheetsMissed != that.noOfTimesheetsMissed) return false;
    if (!employeeId.equals(that.employeeId)) return false;
    return missedTimesheets.equals(that.missedTimesheets);

  }

  @Override
  public int hashCode() {
    int result = employeeId.hashCode();
    result = 31 * result + missedTimesheets.hashCode();
    result = 31 * result + noOfTimesheetsMissed;
    return result;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public List<MissedTimesheet> getMissedTimesheets() {
    return missedTimesheets;
  }

  public void setMissedTimesheets(List<MissedTimesheet> missedTimesheets) {
    this.missedTimesheets = missedTimesheets;
  }

  public int getNoOfTimesheetsMissed() {
    return noOfTimesheetsMissed;
  }

  public void setNoOfTimesheetsMissed(int noOfTimesheetsMissed) {
    this.noOfTimesheetsMissed = noOfTimesheetsMissed;
  }


  public int compareTo(TimesheetMissedMapping o) {
    return o.getNoOfTimesheetsMissed()-this.getNoOfTimesheetsMissed();
  }
}
