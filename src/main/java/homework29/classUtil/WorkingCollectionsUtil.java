package homework29.classUtil;

import homework29.userClasses.Document;

import java.io.*;
import java.util.*;

public final class WorkingCollectionsUtil {

    private WorkingCollectionsUtil() {
    }

    public static Map<String, Document> countWriteMap(String txtUnsortedNumbersPhone, Map mapSortedNumbersPhoneUsers) {
        Set<String> setNumbersPhone = new HashSet<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(txtUnsortedNumbersPhone))) {
            String stringBuffer;
            while ((stringBuffer = bufferedReader.readLine()) != null) {
                setNumbersPhone.add(stringBuffer);
            }
            return copeList(setNumbersPhone, mapSortedNumbersPhoneUsers);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Map<String, Document> copeList(Set<String> set, Map map) {
        for (String string : set) {
            map.put(string, new Document());
        }
        return map;
    }

    public static void outputMap(Map<String, Document> map) {
        for (Map.Entry<String, Document> pair : map.entrySet()) {
            String key = pair.getKey();
            Document value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }

    public static String randomName() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 7;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }


}