package com.shady.cassandrademo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;

@Configuration
public class CassandraConfiguration extends AbstractCassandraConfiguration {



    //table space must be created manually

    @Override
    public String getKeyspaceName() {
        return "Magazines";
    }

    @Override
    public String getLocalDataCenter() {
        return "datacenter1";
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

  /*  @Override
    public String getContactPoints() {
        return "localhost";
    }

    *//*
     * Provide a keyspace name to the configuration.
     *//*
    @Override
    public String getKeyspaceName() {
        return "Magazines";
    }



    */

}
