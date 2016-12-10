package com.thoughtworks.timesheet.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.timesheet.domain.Person;

/**
 * Created by vohray on 12/9/16.
 */
public class PersonJSONParser {
  public static final Gson gson = new GsonBuilder().create();

  public Person parsePerson(String Json){

    return gson.fromJson(Json,Person.class);

  }

}
