package com.thoughtworks.timesheet.domain;

/**
 * Created by vohray on 12/10/16.
 */
public class MissedTimesheet
{
  private String accountName;
  private String weekend;
  private String country;
  private String workingOffice;

  public MissedTimesheet() {
  }


  public MissedTimesheet(String accountName, String weekend, String country, String workingOffice) {
    this.accountName = accountName;
    this.weekend = weekend;
    this.country = country;
    this.workingOffice = workingOffice;
  }


  public String getWorkingOffice() {
    return workingOffice;
  }

  public String getAccountName() {
    return accountName;
  }

  public String getWeekend() {
    return weekend;
  }

  public String getCountry() {
    return country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MissedTimesheet)) return false;

    MissedTimesheet that = (MissedTimesheet) o;

    if (getAccountName() != null ? !getAccountName().equals(that.getAccountName()) : that.getAccountName() != null)
      return false;
    if (getWeekend() != null ? !getWeekend().equals(that.getWeekend()) : that.getWeekend() != null) return false;
    if (getCountry() != null ? !getCountry().equals(that.getCountry()) : that.getCountry() != null) return false;
    return getWorkingOffice() != null ? getWorkingOffice().equals(that.getWorkingOffice()) : that.getWorkingOffice() == null;

  }

  @Override
  public int hashCode() {
    int result = getAccountName() != null ? getAccountName().hashCode() : 0;
    result = 31 * result + (getWeekend() != null ? getWeekend().hashCode() : 0);
    result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
    result = 31 * result + (getWorkingOffice() != null ? getWorkingOffice().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MissedTimesheet{" +
      "accountName='" + accountName + '\'' +
      ", weekend='" + weekend + '\'' +
      ", country='" + country + '\'' +
      ", workingOffice='" + workingOffice + '\'' +
      '}';
  }
}
