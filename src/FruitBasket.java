import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class FruitBasket {

    static ArrayList names = new ArrayList();
    static ArrayList size = new ArrayList();
    static ArrayList color = new ArrayList();
    static ArrayList shape = new ArrayList();
    static ArrayList days = new ArrayList();
    static ArrayList<Integer> sizeToInt;
    static Integer sum = 0;


    public static void main(String[] args) {
        //read csv file
        String csvFilePath = "C:\\RepoCM\\MyJavaPrac\\src\\basket.csv";
        String line = "";
        String[] basketArray = new String[10];
        try {
            BufferedReader b = new BufferedReader(new FileReader(csvFilePath));
            while ((line = b.readLine()) != null) {
                basketArray = line.split(",");
                names.add(basketArray[0]);
                size.add(basketArray[1]);
                color.add(basketArray[2]);
                shape.add(basketArray[3]);
                days.add(basketArray[4]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        task1();
        task2();
        task3();
        task5();
    }

    public static void task1(){
        size.remove(0);
        sizeToInt =  new ArrayList<>(size);
        for (int i = 0; i < sizeToInt.size(); i++) {
            sum += Integer.parseInt(String.valueOf(sizeToInt.get(i)));
        }
        System.out.println("1: Total number of fruit: "+sum);
    }

    public static void task2(){
        names.remove(0);
        Set<String> set = new LinkedHashSet<>(names);
        System.out.println("2: Total types of fruit: " + set.size());
    }

    public static void task3(){
        System.out.println("3: Number of each type of fruit");
        Integer totalOrange = 0;
        Integer totalpineapple = 0;
        Integer totalgrape = 0;
        Integer totalpear = 0;
        Integer totalapple = 0;
        Integer totalgrapefruit = 0;

        for (int k = 0; k < names.size(); k++) {
            try {
                if (names.get(k).equals("orange")) {
                    totalOrange += Integer.parseInt(String.valueOf(sizeToInt.get(k)));
                } else if (names.get(k).equals("pineapple")) {
                    totalpineapple += Integer.parseInt(String.valueOf(sizeToInt.get(k)));
                } else if (names.get(k).equals("grape")) {
                    totalgrape += Integer.parseInt(String.valueOf(sizeToInt.get(k)));
                } else if (names.get(k).equals("pear")) {
                    totalpear += Integer.parseInt(String.valueOf(sizeToInt.get(k)));
                } else if (names.get(k).equals("apple")) {
                    totalapple += Integer.parseInt(String.valueOf(sizeToInt.get(k)));
                } else if (names.get(k).equals("grapefruit")) {
                    totalgrapefruit += Integer.parseInt(String.valueOf(sizeToInt.get(k)));
                }
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }
        System.out.println(totalOrange+" oranges");
        System.out.println(totalpineapple+" pineapples");
        System.out.println(totalgrape+" grapes");
        System.out.println(totalpear+" pears");
        System.out.println(totalapple+" apples");
        System.out.println(totalgrapefruit+" grapefruits");
    }

    public static void task5(){
        days.remove(0);
        ArrayList<Integer> y =  new ArrayList<>(days);
        System.out.println("5: Fruits been in the basket for over 3 days ");
        for (int i = 0; i < y.size(); i++) {
            int j= Integer.parseInt(String.valueOf(y.get(i)));
            if(j<=3){
                System.out.println(names.get(j)+" "+ size.get(j));
            }
        }
    }

}
