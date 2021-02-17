package org.suite.cass.test.interfaces;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;
import org.suite.cass.test.model.TestModel;


public interface ICassendraRepo extends CassandraRepository<TestModel, UUID>{

}
