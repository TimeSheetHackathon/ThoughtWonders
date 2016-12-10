package com.thoughtworks.timesheet.Json;

import com.google.gson.Gson;
import com.thoughtworks.timesheet.domain.GoFigureThoughtworker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class MissingTimecardReader {
    private static String urlFormat = "http://10.132.22.18:3000/api/utilisation/%s/%s/missing-timesheets-with-assignment";
    private static int monthStart = 7;
    private static int monthEnd = 11;
    private static int year = 2016;

    public List<GoFigureThoughtworker> getAll() {
        List<GoFigureThoughtworker> allMissedTimesheets = new ArrayList<>();
        IntStream.range(monthStart, monthEnd + 1).forEach(month -> {
            String urlForMonth = String.format(urlFormat, year, month);
            try {
                String response = JsonReader.readFromUrl(urlForMonth);
                GoFigureThoughtworker[] thoughtworkers = new Gson().fromJson(response, GoFigureThoughtworker[].class);
                allMissedTimesheets.addAll(asList(thoughtworkers));
            } catch (IOException e) {
                throw new RuntimeException("Error while reading from url " + urlForMonth, e);
            }
        });
        return allMissedTimesheets;
    }
}
