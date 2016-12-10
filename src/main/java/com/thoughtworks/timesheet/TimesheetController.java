package com.thoughtworks.timesheet;

import com.google.gson.Gson;
import com.thoughtworks.timesheet.Json.MissingTimecardReader;
import com.thoughtworks.timesheet.domain.GoFigureThoughtworker;
import com.thoughtworks.timesheet.domain.MissedTimesheet;
import com.thoughtworks.timesheet.mappings.ThoughtWorkerMissingTimesheetMappingsHolder;
import com.thoughtworks.timesheet.transformers.GoFigureMissingTimesheetTransformer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class TimesheetController {
    @RequestMapping(value = "/timesheets", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody String getAllTimesheets(Model model) {
        List<GoFigureThoughtworker> all = new MissingTimecardReader().getAll();
        ThoughtWorkerMissingTimesheetMappingsHolder timesheetMappingsHolder = GoFigureMissingTimesheetTransformer.transformGoFigures(all);
        Map<String, List<MissedTimesheet>> missedTimesheetsMap = timesheetMappingsHolder.getTimesheetMapper();
        return "index";
    }

    @RequestMapping(value = "/timesheets/{id}", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    String getAllTimesheetsForPerson(@PathVariable(value = "id") String id, Model model) {
        List<GoFigureThoughtworker> all = new MissingTimecardReader().getAll();
        ThoughtWorkerMissingTimesheetMappingsHolder timesheetMappingsHolder = GoFigureMissingTimesheetTransformer.transformGoFigures(all);
        return new Gson().toJson(timesheetMappingsHolder.getTimesheet(id));
    }
}
