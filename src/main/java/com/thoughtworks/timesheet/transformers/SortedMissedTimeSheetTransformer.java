package com.thoughtworks.timesheet.transformers;

import com.thoughtworks.timesheet.domain.MissedTimesheet;
import com.thoughtworks.timesheet.domain.TimesheetMissedMapping;
import com.thoughtworks.timesheet.mappings.MissedTImesheetSortedSet;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by vohray on 12/10/16.
 */
public class SortedMissedTimeSheetTransformer {

  public static MissedTImesheetSortedSet transformSortedTimeSheets(Map<String,List<MissedTimesheet>> timesheetMapper)
  {
    TreeSet<TimesheetMissedMapping> set =new TreeSet<TimesheetMissedMapping>();
    for(Map.Entry<String,List<MissedTimesheet>> entry:timesheetMapper.entrySet())
    {
      set.add(new TimesheetMissedMapping(entry.getKey(),entry.getValue(),entry.getValue().size()));
    }
    return new MissedTImesheetSortedSet(set);
  }

}
