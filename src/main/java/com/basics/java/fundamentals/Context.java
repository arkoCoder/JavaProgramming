package com.basics.java.fundamentals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class contains the contextual information about the event. This contains
 * details like class version, service type, and the event ID and other
 * information.
 * 
 * @author Anshu Gupta
 * @since 1.0
 */
@JsonInclude(Include.NON_NULL)
public class Context {

    public Context() {
        super();
    }

    /**
     * Version of the class used by subscribing services to identify that fields
     * may have been added or deprecated from the class.
     */
    @JsonProperty("ClassVersion")
    private String classVersion;

    /**
     * Name of the service publishing the event, i.e., cs, lhserver
     */
    @JsonProperty("ServiceName")
    private String serviceName;

    /**
     * Version of the service publishing the event
     */
    @JsonProperty("ServiceVersion")
    private String serviceVersion;

    /**
     * Event GUID that uniquely identify each event. Used for debug purposes.
     */
    @JsonProperty("EventID")
    private String eventID;

    /**
     * Unique name of the event, i.e., WIFIDeleted, WIFICreated
     */
    @JsonProperty("EventName")
    private String eventName;

    /**
     * Date & Time of the event publish
     */
    @JsonProperty("PubDateTime")
    private String pubDateTime;

    /**
     * Unique Company identifier (GUID)., i.e., Tenant ID.
     */
    @JsonProperty("CompanyID")
    private String companyID;

    /**
     * Unique User identifier (GUID). This is the ID of the user that took an
     * action that generated an event. If the event is not related to a user
     * action, this field will be null.
     */
    @JsonProperty("UserID")
    private String userID;

    /**
     * Unique Device identifier (GUID). This is the ID of the device that
     * generated an event. If the event is not related to a device event, this
     * field will be null.
     */
    @JsonProperty("DeviceID")
    private String deviceID;

    /**
     * Unique user session identifier (GUID).
     */
    @JsonProperty("SessionID")
    private String sessionID;

    /**
     * @return the classVersion
     */
    public String getClassVersion() {
        return classVersion;
    }

    /**
     * @param classVersion
     *            the classVersion to set
     */
    public void setClassVersion(String classVersion) {
        this.classVersion = classVersion;
    }

    /**
     * @return the serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * @param serviceName
     *            the serviceName to set
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * @return the serviceVersion
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * @param serviceVersion
     *            the serviceVersion to set
     */
    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    /**
     * @return the eventID
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * @param eventID
     *            the eventID to set
     */
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName
     *            the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return the pubDateTime
     */
    public String getPubDateTime() {
        return pubDateTime;
    }

    /**
     * @param pubDateTime
     *            the pubDateTime to set
     */
    public void setPubDateTime(String pubDateTime) {
        this.pubDateTime = pubDateTime;
    }

    /**
     * @return the companyID
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * @param companyID
     *            the companyID to set
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID
     *            the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the deviceID
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * @param deviceID
     *            the deviceID to set
     */
    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    /**
     * @return the sessionID
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * @param sessionID
     *            the sessionID to set
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    /**
     * @param classVersion
     * @param serviceName
     * @param serviceVersion
     * @param eventID
     * @param eventName
     * @param pubDateTime
     * @param companyID
     * @param userID
     * @param deviceID
     * @param sessionID
     */
    public Context(String classVersion, String serviceName,
            String serviceVersion, String eventID, String eventName,
            String pubDateTime, String companyID, String userID,
            String deviceID, String sessionID) {
        super();
        this.classVersion = classVersion;
        this.serviceName = serviceName;
        this.serviceVersion = serviceVersion;
        this.eventID = eventID;
        this.eventName = eventName;
        this.pubDateTime = pubDateTime;
        this.companyID = companyID;
        this.userID = userID;
        this.deviceID = deviceID;
        this.sessionID = sessionID;
    }

    @Override
    public String toString() {
        return "Context [classVersion=" + classVersion + ", serviceName="
                + serviceName + ", serviceVersion=" + serviceVersion
                + ", eventID=" + eventID + ", eventName=" + eventName
                + ", pubDateTime=" + pubDateTime + ", companyID=" + companyID
                + ", userID=" + userID + ", deviceID=" + deviceID
                + ", sessionID=" + sessionID + "]";
    }
}
