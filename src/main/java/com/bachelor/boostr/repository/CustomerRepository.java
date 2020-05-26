package com.bachelor.boostr.repository;

import com.bachelor.boostr.model.Customer;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.N1qlSecondaryIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

@N1qlPrimaryIndexed
@N1qlSecondaryIndexed(indexName = "customer")
public interface CustomerRepository extends CouchbasePagingAndSortingRepository<Customer, Integer> {

}
