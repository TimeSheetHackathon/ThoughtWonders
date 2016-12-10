package com.thoughtworks.timesheet.transformers;

import com.thoughtworks.timesheet.domain.GoFigureThoughtworker;
import com.thoughtworks.timesheet.domain.MissedTimesheet;
import com.thoughtworks.timesheet.mappings.ThoughtWorkerMissingTimesheetMappingsHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by vohray on 12/10/16.
 */
public class GoFigureMissingTimesheetTransformer {

    public static ThoughtWorkerMissingTimesheetMappingsHolder transformGoFigures(List<GoFigureThoughtworker> goFigures) {
        HashMap<String, List<MissedTimesheet>> timesheetMappings = new HashMap<String, List<MissedTimesheet>>();
        for (GoFigureThoughtworker thoughtworker : goFigures) {
            if (timesheetMappings.containsKey(thoughtworker.getId())) {
                timesheetMappings.get(thoughtworker.getId()).add(MissedTimesheetTransformer.getMissedTimesheet(thoughtworker));
            } else {
                List<MissedTimesheet> missedTimesheets = new ArrayList<MissedTimesheet>();
                missedTimesheets.add(MissedTimesheetTransformer.getMissedTimesheet(thoughtworker));
                timesheetMappings.put(thoughtworker.getId(), missedTimesheets);
            }
        }
        return new ThoughtWorkerMissingTimesheetMappingsHolder(timesheetMappings);
    }

}
