package com.thoughtworks.timesheet.domain;

/**
 * Created by vohray on 12/9/16.
 */
public class Person {
  private String name;
  private String employeeId;

  public Person(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;

    Person person = (Person) o;

    if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
    return getEmployeeId() != null ? getEmployeeId().equals(person.getEmployeeId()) : person.getEmployeeId() == null;

  }

  @Override
  public int hashCode() {
    int result = getName() != null ? getName().hashCode() : 0;
    result = 31 * result + (getEmployeeId() != null ? getEmployeeId().hashCode() : 0);
    return result;
  }



}
