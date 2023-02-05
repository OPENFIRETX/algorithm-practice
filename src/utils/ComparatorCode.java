package utils;

import java.util.Comparator;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ComparatorCode {

    public static class Student {
        public String name;
        public int id;
        public int age;

        public Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
    }

    public static class IdAscendingComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }

    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Name : " + student.name + ", Id : " + student.id + ", Age : " + student.age);
        }
    }

    //    自定义比较器 大根堆
    public static class MyComp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }

    }


    public static void main(String[] args) {

        Student s1 = new Student("A", 2, 20);
        Student s2 = new Student("B", 3, 21);
        Student s3 = new Student("C", 1, 22);

        Student[] students = new Student[]{s1, s2, s3};
        printStudents(students);

        Arrays.sort(students, new IdAscendingComparator());
        printStudents(students);

        System.out.println("====================");

        PriorityQueue<Integer> heap = new PriorityQueue<>(new MyComp());
        heap.add(5);
        heap.add(6);
        heap.add(2);
        heap.add(0);
        heap.add(8);
        heap.add(1);
        heap.add(7);

        while (!heap.isEmpty()) {
            System.out.println(heap.poll());
        }

    }
}
