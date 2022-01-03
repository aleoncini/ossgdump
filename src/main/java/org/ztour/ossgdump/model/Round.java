package org.ztour.ossgdump.model;

import java.util.Map;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection="scores")
public class Round extends PanacheMongoEntity {
    public String tournamentId;
    public String playerName;
    public String playerId;
    public int phcp;
    public int day;
    public Map<String,Integer> holes; 
}