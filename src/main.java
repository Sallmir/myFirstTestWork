import students.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        ArrayList<Student> groupIER = new ArrayList<>();
        //group 1 ( IER )
        Student student1 = new Student("Петр", "Петров", "МЭВ", 1, 90, 10);
        Student student2 = new Student("Сидор", "Сидоров", "МЭВ", 1, 80, 9);
        Student student3 = new Student("Иван", "Иванов", "МЭВ", 1, 70, 8);
        Student student4 = new Student("Павел", "Павлов", "МЭВ", 1, 60, 7);
        Student student5 = new Student("Евгений", "Евгенов", "МЭВ", 1, 50, 6);
        groupIER.add(student1);
        groupIER.add(student2);
        groupIER.add(student3);
        groupIER.add(student4);
        groupIER.add(student5);

        ArrayList<Student> phisics = new ArrayList<>();
        //group 2 (phisics)
        Student student6 = new Student("Петр2", "Петров2", "ФИЗ", 2, 90, 10);
        Student student7 = new Student("Сидор2", "Сидоров2", "ФИЗ", 2, 80, 9);
        Student student8 = new Student("Иван2", "Иванов2", "ФИЗ", 2, 70, 8);
        Student student9 = new Student("Павел2", "Павлов2", "ФИЗ", 2, 60, 7);
        Student student10 = new Student("Евгений2", "Евгенов2", "ФИЗ", 2, 50, 6);
        phisics.add(student6);
        phisics.add(student7);
        phisics.add(student8);
        phisics.add(student9);
        phisics.add(student10);

        ArrayList<Student> foreingL = new ArrayList<>();
        //group 3 (Foreing Languages)
        Student student11 = new Student("Петр3", "Петров3", "ИнЯз", 3, 90, 10);
        Student student12 = new Student("Сидор3", "Сидоров3", "ИнЯз", 3, 80, 9);
        Student student13 = new Student("Иван3", "Иванов3", "ИнЯз", 3, 70, 8);
        Student student14 = new Student("Павел3", "Павлов3", "ИнЯз", 3, 60, 7);
        Student student15 = new Student("Евгений3", "Евгенов3", "ИнЯз", 3, 50, 6);
        foreingL.add(student11);
        foreingL.add(student12);
        foreingL.add(student13);
        foreingL.add(student14);
        foreingL.add(student15);




        // перекличка
        musterShow(groupIER);
        musterShow(phisics);
        musterShow(foreingL);

        //староста
        groupMaster(groupIER);
        groupMaster(phisics);
        groupMaster(foreingL);

    }


    public static void musterShow(ArrayList<Student> group){
         Collections.sort(group, Student.snorderer);
         group.stream().forEach(x->System.out.println(x.getLastName()));
        System.out.println();
        int y;
         for (Student g: group){
             y = (int) (1 + (Math.random() * (3 - 1)));
             if (y == 2)
                 System.out.println(g.getLastName()+ "- Отсутсвует");
         }
        System.out.println();
    }

    public static void groupMaster (ArrayList<Student> group){

        Collections.sort(group, Student.prorderer);
        System.out.println(group.get(0));

    }



}
