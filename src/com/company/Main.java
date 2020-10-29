package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String readIn = in.readLine();
        System.out.println(readIn);
    }
}
