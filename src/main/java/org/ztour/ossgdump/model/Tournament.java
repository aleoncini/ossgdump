package org.ztour.ossgdump.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection="leaderboards")
public class Tournament extends PanacheMongoEntity {
    
    public String title;
    public String location;
    public String date;
    public String formula;

}