package com.sports;

public class SportsPersonDetails {
    String sportPersonName;
    String personSport;
    String personStatus;

    public SportsPersonDetails(String sportPersonName, String personSport, String personStatus) {
        this.sportPersonName = sportPersonName;
        this.personSport = personSport;
        this.personStatus = personStatus;
    }

    public String getSportPersonName() {
        return sportPersonName;
    }

    public void setSportPersonName(String sportPersonName) {
        this.sportPersonName = sportPersonName;
    }

    public String getPersonSport() {
        return personSport;
    }

    public void setPersonSport(String personSport) {
        this.personSport = personSport;
    }

    public String getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus;
    }

    @Override
    public String toString() {
        return "SportsPersonDetails{" +
                "sportPersonName='" + sportPersonName + '\'' +
                ", personSport='" + personSport + '\'' +
                ", personStatus='" + personStatus + '\'' +
                '}';
    }
}
