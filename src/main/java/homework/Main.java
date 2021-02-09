package homework;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] strarr= {
                {"1245","23523","232","21211"},
                {"1245","23523","232","221211"},
                {"1245","23523","232","21211"},
                {"1245","23523","232","21211"}
        };
        try{
            System.out.println(methodOne(strarr));
        }catch (MyArraySizeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }

    }
    public static int methodOne(String arr[][]) {
        for (int i =0; i<arr.length; i++){
            if(arr[i].length!=4 && arr.length!=4){
                throw new  MyArraySizeException("Ошибка, Передан не верный размер массива. Переданный размер больше 4");
        }}
        int sum=0;
        for (int i = 0; i< arr.length; i++) {
            for(int j =0; j<arr[i].length; j++){
                try {
                    sum += Integer.parseInt(arr[i][j]);
                }catch (MyArrayDataException e){
                    System.out.println("Ой, ошибка случилась!");
                    throw e;
                }
            }
        }
        return sum;

}}
