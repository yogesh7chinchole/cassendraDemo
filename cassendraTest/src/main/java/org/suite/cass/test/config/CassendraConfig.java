package org.suite.cass.test.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassendraConfig extends AbstractCassandraConfiguration {

	 public static final String KEYSPACE = "test_keyspace";

	    @Override
	    public SchemaAction getSchemaAction() {
	        return SchemaAction.CREATE_IF_NOT_EXISTS;
	    }

	    @Override
	    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
	        CreateKeyspaceSpecification specification = CreateKeyspaceSpecification
	        		.createKeyspace(KEYSPACE)
	        		.ifNotExists(true);

	        return Arrays.asList(specification);
	    }

	    @Override
	    protected List<DropKeyspaceSpecification> getKeyspaceDrops() {
	       // return Arrays.asList(DropKeyspaceSpecification.dropKeyspace(KEYSPACE));
	    	return Collections.emptyList();
	    }

	    @Override
	    protected String getKeyspaceName() {
	        return KEYSPACE;
	    }

	    @Override
	    public String[] getEntityBasePackages() {
	        return new String[]{"org.suite.cass.test.model"};
	    }

}
