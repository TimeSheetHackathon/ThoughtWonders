package com.thoughtworks.timesheet.transformers;

import com.thoughtworks.timesheet.domain.GoFigureThoughtworker;
import com.thoughtworks.timesheet.domain.MissedTimesheet;

/**
 * Created by vohray on 12/10/16.
 */
public class MissedTimesheetTransformer {

  public static MissedTimesheet getMissedTimesheet(GoFigureThoughtworker thoughtworker)
  {
    MissedTimesheet timesheet=new MissedTimesheet(thoughtworker.getAccountName(),thoughtworker.getWeekend(),thoughtworker.getCountry(),thoughtworker.getWorkingOffice());
    return timesheet;
  }

}
