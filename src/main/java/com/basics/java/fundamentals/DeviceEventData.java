package com.basics.java.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceEventData extends EventData {

    public DeviceEventData() {
        super();
        List<Data> list = new ArrayList<>();
        list.add(new Data());
        setData(list);
        Context context = new Context("1.0", "eventLib", "1.9",
                "61f56eee-b4e8-4245-ae01-b942c3351d22", "EventLibUnitTest",
                "20170504T143709", "9b5d5cca-46fe-48a9-932a-19bea2ee19a4",
                "93b332e8-dca0-47b1-afb0-047d4a684bef",
                "e0p6tBMNtetPjY7J3N0edoAA8m4VTyvkqEgaUts_EVc", null);
        setContext(context);
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class Data {

        @JsonProperty("payload")
        public String payload = "{\"errorreason\":\"locationHierarchyData object not found\",\"errorcode\":0,\"clientClassVersion\":\"1.0\",\"servicekey\":"
                + "\"multitenancy_hp_1.0\",\"datetime\":\"20200626T000554\",\"locationdata\":\"IN\\\\Buildin"+ System.nanoTime() + "g4\\\\Aurangabad\\\\IncomeTaxColony\"}";

        @JsonProperty("severity")
        public String severity = "info";
        
        @JsonProperty("endpoint_uid")
        public String endpoint_uid = "swOhwaq4cNKhnVtcz_QyHSecwonACRlIh1Ide5YNyeQ";

        @JsonProperty("event_type")
        public String eventType = "DeviceHierarchyLocationUpdated";

        @JsonProperty("service_key")
        public String serviceKey = "multitenancy_hp_1";

        @JsonProperty("token_data")
        public TokenData tokenData = new TokenData();

        public Data() {
            super();
        }

        /**
         * @return the endpoint_uid
         */
        public String getEndpoint_uid() {
            return endpoint_uid;
        }

        /**
         * @param endpoint_uid the endpoint_uid to set
         */
        public void setEndpoint_uid(String endpoint_uid) {
            this.endpoint_uid = endpoint_uid;
        }

        public String getPayload() {
            return payload;
        }

        public void setPayload(String payload) {
            this.payload = payload;
        }

        public String getSeverity() {
            return severity;
        }

        public void setSeverity(String severity) {
            this.severity = severity;
        }

        public String getEventType() {
            return eventType;
        }

        public void setEventType(String eventType) {
            this.eventType = eventType;
        }

        public String getServiceKey() {
            return serviceKey;
        }

        public void setServiceKey(String serviceKey) {
            this.serviceKey = serviceKey;
        }

        public TokenData getTokenData() {
            return tokenData;
        }

        public void setTokenData(TokenData tokenData) {
            this.tokenData = tokenData;
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class TokenData {

        @JsonProperty("parent")
        public String parent = "62e05de7-ce4c-4e9f-befc-f0492b48e70b";

        // device UID
        @JsonProperty("sub")
        public String sub = "swOhwaq4cNKhnVtcz_QyHSecwonACRlIh1Ide5YNyeQ";

        @JsonProperty("ver")
        public String ver = "1.0";

        @JsonProperty("iss")
        public String iss = "idm.hptpm.com";

        @JsonProperty("nonce")
        public String nonce = "e3e3c01f-07b2-49ea-a259-8eb65d55ee82";

        @JsonProperty("device_state")
        public String deviceState ="ACTIVE";
        @JsonProperty("authority")
        public String authority = "hptpm/device";
        @JsonProperty("scopes")
        public List<String> scopes = new ArrayList<String>(Collections.singleton("user_identity"));

        @JsonProperty("exp")
        public Integer exp = 1593169245;

        @JsonProperty("user")
        public String user = "dfc82067-012d-4cd9-bc08-94e059e40e3a";

        @JsonProperty("iat")
        public Integer iat = 1593082845;

        @JsonProperty("tenant")
        public String tenant = "5e42e0d9-a694-4f80-897d-96a0044d6ca6";

        @JsonProperty("app_site")
        public String appSite = "DAAS_TEST";

        @JsonProperty("device_scope")
        public String deviceScope = "ALL";

        public TokenData() {
            super();
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public String getSub() {
            return sub;
        }

        public void setSub(String sub) {
            this.sub = sub;
        }

        public String getVer() {
            return ver;
        }

        public void setVer(String ver) {
            this.ver = ver;
        }

        public String getIss() {
            return iss;
        }

        public void setIss(String iss) {
            this.iss = iss;
        }

        public String getNonce() {
            return nonce;
        }

        public void setNonce(String nonce) {
            this.nonce = nonce;
        }

        public String getDeviceState() {
            return deviceState;
        }

        public void setDeviceState(String deviceState) {
            this.deviceState = deviceState;
        }

        public String getAuthority() {
            return authority;
        }

        public void setAuthority(String authority) {
            this.authority = authority;
        }

        public List<String> getScopes() {
            return scopes;
        }

        public void setScopes(List<String> scopes) {
            this.scopes = scopes;
        }

        public Integer getExp() {
            return exp;
        }

        public void setExp(Integer exp) {
            this.exp = exp;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public Integer getIat() {
            return iat;
        }

        public void setIat(Integer iat) {
            this.iat = iat;
        }

        public String getTenant() {
            return tenant;
        }

        public void setTenant(String tenant) {
            this.tenant = tenant;
        }

        public String getAppSite() {
            return appSite;
        }

        public void setAppSite(String appSite) {
            this.appSite = appSite;
        }

        public String getDeviceScope() {
            return deviceScope;
        }

        public void setDeviceScope(String deviceScope) {
            this.deviceScope = deviceScope;
        }}
}
