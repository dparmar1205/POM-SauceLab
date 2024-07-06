package org.example;


import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
//        hashMapUniqueKeyExample();
//        hashMapWithNumber();
        Integer[] inputs = new Integer[] {1, 2, 3, 10, 4, 3, 10, 2, 4, 1, -1, -1, -1, -1};
        System.out.println("are all numbers in pair: {}" + checkPairOfNumbersAreEvenInArray(inputs));
        inputs = new Integer[] {1, 10, 4, 3, 10, 2, 4, 1};
        System.out.println("are all numbers in pair: {}"+ checkPairOfNumbersAreEvenInArray(inputs));
    }

    public static boolean checkPairOfNumbersAreEvenInArray(Integer[] values) {
        HashMap<Integer, Integer> mapOfNumber = new HashMap<>();
        for (Integer value: values) {
            addOrIncrementValue(mapOfNumber, value);
        }
        int oddEntryCount = 0;
        for (Map.Entry<Integer, Integer> entry: mapOfNumber.entrySet()) {
            boolean isOdd = entry.getValue() % 2 != 0;
            if (isOdd) {
                oddEntryCount++;
            }
        }
        System.out.println("count of each item in array {}" + mapOfNumber);
        System.out.println("odd entry in array {}" +  oddEntryCount);
        return oddEntryCount == 0;
    }

    public static void hashMapWithNumber() {
        HashMap<String, Integer> fruitWithColor = new HashMap<>();
//        addOrIncrementValue(fruitWithColor, "apple");
//        addOrIncrementValue(fruitWithColor, "apple");
//        addOrIncrementValue(fruitWithColor, "apple");
//        addOrIncrementValue(fruitWithColor, "banana");
        String[] names = new String[] {"apple", "apple", "apple", "banana"};
        for (String name: names) {
            addOrIncrementValue(fruitWithColor, name);
        }

        System.out.println("fruit name and count {}" + fruitWithColor);
//        if (fruitWithColor.containsKey("apple")) {
//            Integer count = fruitWithColor.get("apple");
//            fruitWithColor.put("apple", count + 1);
//        } else {
//            fruitWithColor.put("apple", 1);
//        }


        System.out.println("Fruit Items {} " +  bfruitWithColor);
    }

    public static void addOrIncrementValue(HashMap<Integer, Integer> fruitCount, Integer key){
        if (fruitCount.containsKey(key)) {
            Integer count = fruitCount.get(key);
            fruitCount.put(key, count + 1);
        } else {
            fruitCount.put(key, 1);
        }
    }
    public static void addOrIncrementValue(HashMap<String, Integer> fruitCount, String key){
        if (fruitCount.containsKey(key)) {
            Integer count = fruitCount.get(key);
            fruitCount.put(key, count + 1);
        } else {
            fruitCount.put(key, 1);
        }
    }
    public static void hashMapUniqueKeyExample() {
        HashMap<String, String> fruitWithColor = new HashMap<>();

        fruitWithColor.put("apple", "red");
        fruitWithColor.put("mango", "yellow");
        fruitWithColor.put("banana", "green");
        fruitWithColor.put("apple", "red");

        System.out.println("Fruit Items {} " +  fruitWithColor);
    }
}


