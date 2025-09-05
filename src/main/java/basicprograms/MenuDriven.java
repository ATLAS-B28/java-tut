package basicprograms;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
* Courses being are offered to students. Students
* have the facility to check which course is available
* at institution. Write a program
* 1. Search of course
* 2. Sort the list of courses in an ascending alphabets
* 3. Sort courses in ascending order of length of spelling
* */
public class MenuDriven {

    final private List<String> courses;

    public MenuDriven() {
        this.courses = List.of("Java", "Python", "C++", "C",
                "JavaScript", "Rust", "SQL", "Go", "Erlang",
                "Elixir", "Gleam", "Haskell", "Kotlin", "Racket");
    }

    private String courseSearch(String course) {
        //depending on user input search the course
        if(courses.contains(course)) {
            return String.format("Course: %s is available", course);
        } else {
            return String.format("Course: %s is not available", course);
        }
    }

    private List<String> ascendingAlphabets() {
        //using stream sort the courses in ascending order
        return courses.stream().sorted().toList();
    }

    private List<String> ascendingLength() {
        //using stream sort the courses in ascending order of length
        //using comparator interface and passing string length as comparator
        return courses.stream().sorted(Comparator.comparing(String::length)).toList();
    }

    public static void main(String[] args) {
        MenuDriven menuDriven = new MenuDriven();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course name to search: ");
        String courseName = sc.nextLine();
        System.out.println(menuDriven.courseSearch(courseName));
        System.out.println("Ascending order based on alphabets: ");
        System.out.println(menuDriven.ascendingAlphabets());
        System.out.println("Ascending order based on length: ");
        System.out.println(menuDriven.ascendingLength());

    }
}
