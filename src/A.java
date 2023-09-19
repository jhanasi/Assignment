//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Reader;
//import java.util.*;
//
//public class A {
//
//            public static void main(String[] args) {
//                String csvFilePath="C:\\RepoCM\\MyJavaPrac\\src\\basket.csv";
//                String line="";
//                String[] basketArray= new String[10];
//                ArrayList names=new ArrayList();
//                ArrayList size=new ArrayList();
//                ArrayList color=new ArrayList();
//                ArrayList shape=new ArrayList();
//                ArrayList days=new ArrayList();
//                ArrayList<Integer> sizeToInt;
//                Integer sum = 0;
//                try{
//                    BufferedReader b=new BufferedReader(new FileReader(csvFilePath));
//                    while ((line=b.readLine())!=null){
//                        basketArray=line.split(",");
//                        names.add(basketArray[0]);
//                        size.add(basketArray[1]);
//                        color.add(basketArray[2]);
//                        shape.add(basketArray[3]);
//                        days.add(basketArray[4]);
//                   }
//                    //task 1=========================================================================================================================================
//                    size.remove(0);
//                    sizeToInt =  new ArrayList<>(size);
//                    for (int i = 0; i < sizeToInt.size(); i++) {
//                        sum += Integer.parseInt(String.valueOf(sizeToInt.get(i)));
//                    }
//                     //System.out.println("1: Total number of fruit: "+sum);
//
//                    //task 2========================================================================================================================
//                    Set<String> set = new LinkedHashSet<>(names);
//                   // System.out.println("2: Total types of fruit: " + set.size());
//
//                    //task 5========================================================================================================================
//                    days.remove(0);
//                    ArrayList<Integer> y =  new ArrayList<>(days);
//                    for (int i = 0; i < y.size(); i++) {
//                        int j= Integer.parseInt(String.valueOf(y.get(i)));
//                         if(j<=3){
//                          //  System.out.println("5: Fruits been in the basket for over 3 days "+ names.get(j));
//                         }
//                    }
//                 // task 3 ====================================================================================================================
//                 /*   HashMap<String, Integer> languageMap = convertArrayListToHashMap(names);
//                    System.out.println("3: Number of each type of fruit in descending order");
//                    for (Map.Entry<String, Integer> entry : languageMap.entrySet()) {
//                        System.out.println(entry.getKey() + " : " + entry.getValue());
//                    }*/
//
//
//                    HashMap<String, Integer> languageMap = convertArrayListToHashMap(names);
//                    /*Stream<Map.Entry<K,V>> sorted =
//                            languageMap.entrySet().stream()
//                                    .sorted(Map.Entry.comparingByValue());*/
//
//                    languageMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//
//                  for (Map.Entry<String, Integer> entry : languageMap.entrySet()) {
//                       System.out.println(entry);
//
//                       // Collections.sort
//                    }
//                    //List<Entry<K, V>> list = new ArrayList<>(languageMap.entrySet());
//
//
//                    // HashMap<String, Integer> temp = languageMap.put(entry.getKey(),entry.getValue());
//
//                    //Collections.sort(
//
//                   // task 4 ====================================================================================================================
//
//
//
//
//
//
//
//
//
//
//
//
//
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//    }
//
//    private static HashMap<String, Integer>
//    convertArrayListToHashMap(ArrayList<String> arrayList)
//    {
//
//        HashMap<String, Integer> hashMap = new HashMap<>();
//
//        for (String str : arrayList) {
//
//            hashMap.put(str, str.length());
//        }
//
//        return hashMap;
//    }
//}
