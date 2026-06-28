package application;

import entities.User;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<User> set = new HashSet<>();

        System.out.print("How many students for a course A? ");
        int course1 = sc.nextInt();

        for(int i = 0; i < course1; i++) {
            int code1 = sc.nextInt();
            set.add(new User(code1));;
        }

        System.out.print("How many students for a course B? ");
        int course2 = sc.nextInt();

        for(int i = 0; i < course2; i++) {
            int code2 = sc.nextInt();
            set.add(new User(code2));
        }

        System.out.print("How many students for a course C? ");
        int course3 = sc.nextInt();

            for(int i = 0; i < course3; i++) {
                int code3 = sc.nextInt();
                set.add(new User(code3));
            }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}