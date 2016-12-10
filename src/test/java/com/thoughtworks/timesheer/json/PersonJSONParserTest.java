package com.thoughtworks.timesheer.json;

import com.thoughtworks.timesheet.Json.PersonJSONParser;
import com.thoughtworks.timesheet.domain.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vohray on 12/9/16.
 */
public class PersonJSONParserTest {

  @Test
  public void testJSONParsing()
  {
    String json="{\n" +
      "\"name\": \"yug\",\n" +
      "\"employeeId\": \"19241\"\n" +
      "  }";

    PersonJSONParser parser=new PersonJSONParser();
    Person person=parser.parsePerson(json);
    Assert.assertTrue(person.getName().equalsIgnoreCase("yug"));
  }


}
