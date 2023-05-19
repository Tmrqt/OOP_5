package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

// Вариант класса ViewEng с текстом на английском языке
public class ViewEng implements iGetView {
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Display the list of students-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----The end of the list-----");
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
