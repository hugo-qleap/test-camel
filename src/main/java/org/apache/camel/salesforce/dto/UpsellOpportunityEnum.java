/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 19 17:27:21 CEST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist UpsellOpportunity__c
 */
public enum UpsellOpportunityEnum {

    // Maybe
    MAYBE("Maybe"),
    // No
    NO("No"),
    // Yes
    YES("Yes");

    final String value;

    private UpsellOpportunityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static UpsellOpportunityEnum fromValue(String value) {
        for (UpsellOpportunityEnum e : UpsellOpportunityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
