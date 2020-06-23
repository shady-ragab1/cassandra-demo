package com.shady.cassandrademo.repos;

import com.shady.cassandrademo.model.MagazineName;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MagazineRepo extends CrudRepository<MagazineName, String> {

    MagazineName findMagazineNameByName(String name);

    MagazineName findMagazineNameByNameStartsWith(String namePrefix);

    @AllowFiltering
    @Query("SELECT * from magazine_name where magazine_id = ?0")
    MagazineName findMagazineCQlQuery(String id);

}
