package Chapter06;

public class Exercise04 {
    static void main(String[] args) {
        String[] names = {
            "John", "Mary", "Michael", "Linda", "David",
            "Patricia", "James", "Susan", "Robert", "Deborah",
            "William", "Barbara", "Christopher", "Debra", "Daniel",
            "Karen", "Matthew", "Nancy", "Joseph", "Donna",
            "Andrew", "Cynthia", "Anthony", "Sandra", "Charles"
        };

        for (String name : names) {
            System.out.println(name + ';');
        }
    }
}