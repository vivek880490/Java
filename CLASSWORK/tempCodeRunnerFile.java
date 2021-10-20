import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxValueInMap = (Collections.max(map.values()));
        int minValueInMap = (Collections.min(map.values()));

        int minva = 0;
        int maxva = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == maxValueInMap) {

                maxva = (entry.getKey());
            }
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == minValueInMap) {

                minva = (entry.getKey());
            }
        }
        if (maxva > minva) {
            System.out.println(maxValueInMap - minValueInMap);
        } else {
            System.out.println(maxva);
        }
    }
