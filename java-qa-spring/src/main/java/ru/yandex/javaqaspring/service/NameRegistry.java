package ru.yandex.javaqaspring.service;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class NameRegistry {

    private final Map<String, String> namesMap = Map.of(
            "uid1", "Mike",
            "uid2", "Oleg"
    );

    public String getName(String uid) {
        return namesMap.get(uid);
    }

}
