package homework5;

public class Homework5 {
    public static void main(String[] args) {
        Person[] persArrays = {
                new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
                        30000, 30),
                new Person("Petrov Danil", "kollektor", "petrov@mailbox.com", "8929483312",
                        80000, 41),
                new Person("Dmitriev Maxim", "Инженер-взрывотехник", "dm@mailbox.com", "892387312",
                        15000, 28),
                new Person("Korneev Nikolay", "бухгалтер", "nikolay@mailbox.com", "892312111",
                        75000, 56),
                new Person("Orehov Gennadii", "таксист", "orexov@mailbox.com", "8929485512",
                        34000, 64)
        };

        for (Person persArray : persArrays) {

            if (persArray.getAge() > 40) {
                System.out.println(persArray);
            }
        }

    }
}

