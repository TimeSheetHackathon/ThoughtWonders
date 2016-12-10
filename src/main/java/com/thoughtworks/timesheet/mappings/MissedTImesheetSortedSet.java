package com.thoughtworks.timesheet.mappings;

import com.thoughtworks.timesheet.domain.TimesheetMissedMapping;

import java.util.TreeSet;

/**
 * Created by vohray on 12/10/16.
 */
public class MissedTImesheetSortedSet {
  private TreeSet<TimesheetMissedMapping> sortedTimesheets;

  public MissedTImesheetSortedSet(TreeSet<TimesheetMissedMapping> sortedTimesheets) {
    this.sortedTimesheets = sortedTimesheets;
  }

  public TreeSet<TimesheetMissedMapping> getSortedTimesheets() {
    return sortedTimesheets;
  }

  public void setSortedTimesheets(TreeSet<TimesheetMissedMapping> sortedTimesheets) {
    this.sortedTimesheets = sortedTimesheets;
  }

}
