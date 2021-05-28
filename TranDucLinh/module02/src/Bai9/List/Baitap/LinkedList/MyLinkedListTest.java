package Bai9.List.Baitap.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student{
            private int ID;
            private String name;

            public Student(int ID, String name) {
                this.ID = ID;
                this.name = name;
            }

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedList<Student> MyLinkedlist = new MyLinkedList<>();
        Student student1 = new Student(1, "Linh");
        Student student2 = new Student(2, "Nam");
        Student student3 = new Student(3, "My");
        Student student4 = new Student(4, "Hai");
        Student student5 = new Student(5, "Lam");

        MyLinkedlist.addFirst(student1);
        MyLinkedlist.addLast(student2);

        for (int i = 0; i < MyLinkedlist.size(); i++) {
            Student student = (Student) MyLinkedlist.get(i);
            System.out.println(student.getName());
        }
        /*list.add("Linh");
        list.add("Nam");
        System.out.println(list.toString());

        list.addFirst("I");
        list.add(1,"am");
        list.addLast("Goodbye");
        System.out.println(list.toString());*/

        /*list.remove(3);
        list.remove("World");
        System.out.println(list.toString());

        System.out.println(list.getFirst() + " " + list.getLast());

        System.out.println("Contain Hello: " + list.contains("Hello"));

        System.out.println("Index of am: " + list.indexOf("am"));*/
    }
}
