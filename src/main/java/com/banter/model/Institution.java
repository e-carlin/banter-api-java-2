package com.banter.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@DynamoDBTable(tableName = "Institutions")
public class Institution {


    @NotNull
    @Setter
    private String id;

    @NotNull
    @Getter
    @Setter
    private String name;


    @DynamoDBHashKey
    public String getId() {
        return id;
    }

}
