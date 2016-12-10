package com.thoughtworks.timesheet.transformers;

import com.thoughtworks.timesheet.domain.GoFigureThoughtworker;
import com.thoughtworks.timesheet.mappings.ThoughtWorkerMissingTimesheetMappingsHolder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vohray on 12/10/16.
 */
public class GoFigureTImesheetTransformerTest {
  @Test
  public void testTransformation()
  {
    GoFigureThoughtworker thoughtworkerYug=new GoFigureThoughtworker("snr","gurgaon","bahmni","yug","bahmni","consultant","19241","2016-08-31","India","Gurgaon","Banglore");
    GoFigureThoughtworker thoughtworkerDhruv=new GoFigureThoughtworker("snr","gurgaon","bahmni","Dhruv","bahmni","consultant","19242","2016-08-31","India","Gurgaon","Banglore");
    List<GoFigureThoughtworker>goFigureThoughtworkers=new ArrayList<GoFigureThoughtworker>();
    goFigureThoughtworkers.add(thoughtworkerDhruv);
    goFigureThoughtworkers.add(thoughtworkerYug);
    ThoughtWorkerMissingTimesheetMappingsHolder holder=GoFigureMissingTimesheetTransformer.transformGoFigures(goFigureThoughtworkers);
    Assert.assertTrue(holder.getAllIdsOfDefaulters().size()==2);
    Assert.assertTrue(holder.getTimesheet("19241").get(0).getAccountName().equalsIgnoreCase("bahmni"));
  }
}
