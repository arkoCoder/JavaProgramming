package com.basics.java.fundamentals;

import java.io.Serializable;

public class PutRecordRequest implements Serializable{

    @Override
    public String toString() {
        return "PutRecordRequest [streamName=" + streamName + ", data=" + data + ", partitionKey=" + partitionKey + "]";
    }

    private static final long serialVersionUID = 1L;

    private String streamName;
    
    private java.nio.ByteBuffer data;
    
    private String partitionKey;
    
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public java.nio.ByteBuffer getData() {
        return data;
    }

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    public String getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

}
