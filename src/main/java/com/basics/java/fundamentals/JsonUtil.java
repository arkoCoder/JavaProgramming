package com.basics.java.fundamentals;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JsonUtil used for job and json related conversions.
 *
 * @author Harichandra Harmalkar
 *
 */
public class JsonUtil {

    /**
     * @param object
     * @return converted object to the json string
     * @throws Exception
     * @throws Exception
     * @throws IOException
     */
    public static String toJson(Object object) throws JsonGenerationException,
            JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }

    /**
     * Converts a json String into a java object
     * 
     * @param jsonString
     *            JSON string
     * @param clazz
     *            class of target entity
     * @return Instance of class of given type
     * @throws Exception
     * @throws Exception
     * @throws IOException
     */
    public static <T> T fromJson(String jsonString, Class<T> clazz)
            throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonString, clazz);
    }

    /**
     * Finds a field name in JSON and returns it's value.
     *
     * @param json
     * @param fieldName
     * @return value
     * @throws IOException
     * @throws Exception
     */
    public static String getValue(final String json, final String fieldName)
            throws JsonProcessingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);
        JsonNode valueNode = rootNode.findValue(fieldName);
        return valueNode != null ? valueNode.textValue() : null;

    }
}
