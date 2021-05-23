package Bai9.List.Baitap.ArrayList;

public class MyListTest {
    public static class Student {
        private int iD;
        private String name;

        public Student(int iD, String name) {
            this.iD = iD;
            this.name = name;
        }



        public int getiD() {
            return iD;
        }

        public void setiD(int iD) {
            this.iD = iD;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Huy");
        Student b = new Student(2, "Linh");
        Student c = new Student(3, "Nam");
        Student d = new Student(4, "Lan");
        Student e = new Student(5, "My");
        Student f = new Student(6, "My2");


        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        /*studentMyList.add(f);*/

        /*studentMyList.clear();
        studentMyList.size();*/
        newMyList = studentMyList.clone();
        Student student = newMyList.remove(1);
        System.out.println(student.getName());
        for (int i = 0; i < newMyList.size(); i++) {
            System.out.println(newMyList.get(i).getName());
        }

        for (int i = 0; i < studentMyList.size(); i++) {
            /*Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getiD());
            System.out.println(student.getName());
            *//*System.out.println(studentMyList.size());*//*
            System.out.println(studentMyList.get(2).getName());
            System.out.println(studentMyList.indexOf(f));
            System.out.println(studentMyList.contains(f));*/

        }
    }
}
