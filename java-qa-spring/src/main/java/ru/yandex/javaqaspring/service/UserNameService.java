package ru.yandex.javaqaspring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserNameService {

    private final NameRegistry nameRegistry;

    public String getNameByUid(String uid) {
        String name = nameRegistry.getName(uid);
        return name == null ? "User not found" : name;
    }

}
