package ru.yandex.lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneStats {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/ru/yandex/lesson7/homework/input_data.txt");
        Scanner in = new Scanner(file);
        HashMap<String, List<String>> phoneMap = new HashMap<>();
        // service -> url
        // loc -> list(sku)
        while (in.hasNextLine()) {
            String name = in.next();
            String surname = in.next();
            String phone = in.nextLine();
            String key = name + " " + surname;
            if (!phoneMap.containsKey(key)) {
                phoneMap.put(key, new ArrayList<>());
            }
            phoneMap.get(key).add(phone.trim());
        }
        phoneMap.forEach((fio, phones) -> {
            System.out.println(fio + ": " + String.join(", ", phones));
        });
    }
}
