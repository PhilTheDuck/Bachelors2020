package com.bachelor.boostr.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    @Id
    private int id;

    @Field
    private String name;
}
