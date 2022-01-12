package com.kiukyu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner findStudent = new Scanner(System.in);

        System.out.print("Nhập tên học viên cần tìm: ");
        String studentName = findStudent.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentName)) {
                System.out.println("Học viên " + studentName + " nằm tại vị trí số " + (i + 1) + " trong mảng.");
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Học viên " + studentName + " không có trong list");
        }

    }
}
