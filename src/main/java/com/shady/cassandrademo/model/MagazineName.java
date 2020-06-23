package com.shady.cassandrademo.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "magazine_name")
@Data
@Builder
public class MagazineName {


    @PrimaryKeyColumn(name = "magazine_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String magazineId;

    @PrimaryKeyColumn(name = "magazine_name", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    private String name;

    @CassandraType(type = CassandraType.Name.SMALLINT)
    private int frequency;
}
