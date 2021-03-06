package com.force.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown=true)
public class JodaTimeAccount {

    @JsonProperty(value="Id")
    String id;
    @JsonProperty(value="Name")
    String name;
    @JsonProperty(value="externalId__c")
    String externalId;
    @JsonProperty(value="AnnualRevenue")
    private Double annualRevenue;

    @JsonProperty("Contacts")
    List<Contact> contacts;

    @JsonProperty("CreatedDate")
    DateTime createdDate;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualRevenue() {
        return annualRevenue;
    }
    public void setAnnualRevenue(Double value) {
        annualRevenue = value;
    }


    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
    public List<Contact> getContacts() {
        return contacts;
    }
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public DateTime getCreatedDate() { return createdDate; }
    public void setCreatedDate(DateTime value) { createdDate = value; }
}
