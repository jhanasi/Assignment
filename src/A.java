import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class A {

            public static void main(String[] args) {
                String path="C:\\RepoCM\\MyJavaPrac\\src\\basket.csv";
                String line="";
                String[] values= new String[10];
                ArrayList names=new ArrayList();
                ArrayList sizeCl=new ArrayList();
                ArrayList color=new ArrayList();
                ArrayList shape=new ArrayList();
                ArrayList days=new ArrayList();
                ArrayList<Integer> x;
                Integer sum = 0;
        try{
            BufferedReader b=new BufferedReader(new FileReader(path));
            while ((line=b.readLine())!=null){
               values=line.split(",");
                names.add(values[0]);
                sizeCl.add(values[1]);
                color.add(values[2]);
                shape.add(values[3]);
                days.add(values[4]);

           }

            //task 1=========================================================================================================================================
            sizeCl.remove(0);
            x =  new ArrayList<>(sizeCl);
            for (int i = 0; i < x.size(); i++) {
                sum += Integer.parseInt(String.valueOf(x.get(i)));
            }
             System.out.println("1 Total number of fruit: "+sum);

            //task 2========================================================================================================================
            Set<String> set = new LinkedHashSet<>(names);
             System.out.println("2 Total types of fruit: " + set.size());

            //task 5========================================================================================================================
            days.remove(0);
            ArrayList<Integer> y =  new ArrayList<>(days);
            for (int i = 0; i < y.size(); i++) {
                int j= Integer.parseInt(String.valueOf(y.get(i)));
                 if(j<=3){
                    System.out.println("Task 5 Fruits been in the basket for over 3 days "+ names.get(j));
                 }
            }
         // task 3 ====================================================================================================================

            HashMap<String, Integer> languageMap = convertArrayListToHashMap(names);
            for (Map.Entry<String, Integer> entry : languageMap.entrySet()) {
                System.out.println("The number of each type of fruit in descending order");

               // HashMap<String, Integer> temp = languageMap.put(entry.getKey(),entry.getValue());

                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            //Collections.sort(

           // task 4 ====================================================================================================================













        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static HashMap<String, Integer>
    convertArrayListToHashMap(ArrayList<String> arrayList)
    {

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String str : arrayList) {

            hashMap.put(str, str.length());
        }

        return hashMap;
    }
}
