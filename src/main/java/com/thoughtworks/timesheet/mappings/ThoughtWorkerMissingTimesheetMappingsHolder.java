package com.thoughtworks.timesheet.mappings;

import com.thoughtworks.timesheet.domain.MissedTimesheet;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by vohray on 12/10/16.
 */
public class ThoughtWorkerMissingTimesheetMappingsHolder {

  public Map<String, List<MissedTimesheet>> getTimesheetMapper() {
    return timesheetMapper;
  }

  private Map<String,List<MissedTimesheet>> timesheetMapper;

  public ThoughtWorkerMissingTimesheetMappingsHolder(Map<String, List<MissedTimesheet>> timesheetMapper) {
    this.timesheetMapper = timesheetMapper;
  }

  public List<MissedTimesheet> getTimesheet(String id)
  {
    return timesheetMapper.get(id);
  }
  public Set<String> getAllIdsOfDefaulters()
  {
    return timesheetMapper.keySet();
  }
}
