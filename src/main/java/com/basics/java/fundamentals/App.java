package com.basics.java.fundamentals;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.collections4.CollectionUtils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App extends Event {
    static Scanner sc = null;

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-mm-ddhh:mm:ss");
        String strDate = df.format(date);
        System.out.println(strDate);
        Set<String> allowedOrigins = null;
        // System.out.println("Value of test String is " + testString);
        System.out.println("Value of allowedOrigins is " + CollectionUtils.isEmpty(allowedOrigins));
        System.out.println("Epoch Time: " + Instant.now().toEpochMilli());
        System.out.println("Hello World " + Instant.ofEpochMilli(Instant.now().toEpochMilli()).atZone(ZoneId.systemDefault()).toLocalDateTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        EventData eventData = new EventData();
        Map<Object, Object> eventMap = new HashMap<Object, Object>();
        final CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
        Event event = null;
        eventMap.put("Timestamp", sdf.format(new Date(System.currentTimeMillis())));
        eventMap.put("ThreadNo", "Thread1");
        eventMap.put("MessageNo", "1");
        eventData.setEvent(eventMap);
        event = new EventDto("DeviceHierarchyLocationUpdated", new DeviceEventData());
        String deviceId = UUID.randomUUID().toString();

        System.out.println("Event " + event.toString());
        System.out.println("EventData " + ByteBuffer.wrap(JsonUtil.toJson(event.getEventData()).getBytes()));

        PutRecordRequest putRecordRequest = new PutRecordRequest();
        putRecordRequest.setStreamName("usdevms");
        putRecordRequest.setData(ByteBuffer.wrap(JsonUtil.toJson(event).getBytes()));
        putRecordRequest.setPartitionKey(deviceId);
        System.out.println("PutRecordRequest is " + putRecordRequest.toString());
        String data = decoder.decode(putRecordRequest.getData()).toString();
        Event event01 = JsonUtil.fromJson(data, Event.class);
        System.out.println("Event " + event01.toString());

        Map<String, String> testMap = new HashMap<>();
        testMap.put("Gopal", "Heda");
        testMap.put("Gopal", "Heda1");

        System.out.println("Test Map is: " + testMap);

        System.out.println("Map basic test");
        Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

        HashSet<String> testHashSet = new HashSet<String>();
        HashSet<String> testHashSet01 = new HashSet<String>();
        HashSet<String> testHashSet02 = new HashSet<String>();
        testHashSet.add("Gopal");
        testHashSet.add("Heda");

        testHashSet01.add("Gopal01");
        testHashSet01.add("Heda01");

        testHashSet02.add("Gopal02");

        map.put("Gopal", testHashSet);

        /*
         * if(map.containsKey("Gopal")){ map.get("Gopal").addAll(testHashSet01); } else
         * { HashSet<String> list = new HashSet<String>(); list.add("Harsh");
         * map.put("Harsh", list); }
         */
        System.out.println("Gopal Value is " + map.get("Gopal"));
        map.computeIfAbsent("Gopal", k -> testHashSet02).addAll(testHashSet01);

        System.out.println("Gopal Value is " + map.get("Gopal"));

        System.out.println("Gopal Value is " + map.get("Kunal"));

        Overiding o = new Overiding();
        o.sayHello("Gopal");

        Overiding o1 = new OverridingChild();
        o1.sayHello("Harsh");

        OverridingChild o2 = new OverridingChild();
        o2.sayHello("Anil");

        /*
         * OverridingChild o3 = new Overiding(); o3.sayHello("Indra");
         */
        int[] fibonacciArray = App.fibonacci(5);

        for (int i : fibonacciArray) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Recurssive hai re baba!! " + App.recurssiveFibonacci(i) + " ");
        }

        System.out.println("Is Isomorphic " + App.isIsomorphic("Chinun", "Darshan"));

        App.printRLE("aaaabbbcca");
        System.out.println("\nAmazon's approach is " + App.amazonApproachForRLE("aaaabbbcca"));

        String testString = "{\"fromDate\":\"2019-03-09\",\"toDate\":\"2019-03-10\"}";
        try {
            SampleRequest ar = App.fromJson(testString, SampleRequest.class);
            System.out.println(ar.getToDate());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Instant.now());
        sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

        System.out.println(BigDecimal.valueOf(2));

    }

    static Node createTree() {
        Node root = null;
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }

        root = new Node(data);
        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static int[] fibonacci(int counter) {
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
        int[] fibonacciArray = new int[counter];
        for (int i = 0; i < counter; i++) {
            // System.out.println(firstNum);
            fibonacciArray[i] = firstNum;
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }

        return fibonacciArray;
    }

    static int recurssiveFibonacci(int sum) {
        if (sum <= 1) {
            return sum;
        }

        return recurssiveFibonacci(sum - 1) + recurssiveFibonacci(sum - 2);
    }

    static boolean isIsomorphic(String s1, String s2) {
        Map<Character, Character> isomorphicMap = new HashMap<Character, Character>();
        for (int i = 0; i < s1.length(); i++) {
            Character s1Char = s1.charAt(i);
            Character s2Char = s2.charAt(i);

            if (isomorphicMap.containsKey(s1Char)) {
                if (isomorphicMap.get(s1Char) != s2Char) {
                    return false;
                }
            } else {
                isomorphicMap.put(s1Char, s2Char);
            }
        }
        HashSet<Character> set = new HashSet<>(isomorphicMap.values());
        if (set.size() == isomorphicMap.values().size()) {
            return true;
        }
        return false;
    }

    public static void printRLE(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {

            // Count occurrences of current character
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Print character and its count
            System.out.print(str.charAt(i));
            System.out.print(count);
        }
    }

    public static String amazonApproachForRLE(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();
        char prevChar = 0;
        int counter = 0;
        for (char c : charArray) {
            if (c == prevChar) {
                counter++;
            } else {
                if (prevChar != 0) {
                    strBuilder.append(counter).append(prevChar);
                }
                prevChar = c;
                counter = 1;
            }
        }
        return strBuilder.append(counter).append(prevChar).toString();
    }

    public static <T> T fromJson(String jsonString, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonString, clazz);
    }

    @Override
    public String getEventType() {
        // TODO Auto-generated method stub
        return null;
    }

    private static int findShortestDistance(String str1, String str2, String[] strs) {
        int distance = Integer.MAX_VALUE;
        String temp = null;
        int index = 0;
        for (int i = 0; i < strs.length; ++i) {
            if (str1.equals(strs[i]) || str2.equals(strs[i])) {
                if (temp != null && !strs[i].equals(temp)) {
                    distance = Math.min(distance, i - index);
                }
                temp = strs[i];
                index = i;
            }
        }
        return distance;
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}
