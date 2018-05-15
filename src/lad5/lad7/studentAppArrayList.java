package lad7;

import lad7.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class studentAppArrayList {
    private static void main (String[]args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many you do have : ");
        int Val = Integer.parseInt(reader.readLine());
        ArrayList<Student> myList = new ArrayList<Student>();
        myList = inputData(myList,Val);
        showdata(myList);
    }

    private static void showdata(ArrayList<Student> myList) {
        for (int i = 0; i<myList.size(); i++){
            System.out.print("Name : " + myList.get(i).getName());
            System.out.print("Age : "+ myList.get(i).getAge());
            System.out.print("Gender : "+myList.get(i).getGender());
            System.out.print("Heigh : " +myList.get(i).getHeight());

        }
    }
}

    private  static  ArrayList inputData(ArrayList<Student> myList,int val)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Student s = new Student();
        for (int i =1; i<=val; i++);{
            System.out.println()("Enter student info " +i+" :");
            System.out.print("Name : ");
            s.setName(reader.readLine());
            System.out.print("Age : ");
            s.setAge(Integer.parseInt(reader.readLine()));
            System.out.print("Gender : ");
            s.setGender(reader.readLine());
            System.out.print("Height :");
            s.setHeight(Double.parseDouble(reader.readLine()));
            myList.add(s);
        }
        return myList;

    }