package lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class studentAppArrayList {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many data do you have: ");
        int val = Integer.parseInt(reader.readLine());
        ArrayList<Student> myList = new ArrayList<Student>();
        myList = inputData(myList, val)
    }//main