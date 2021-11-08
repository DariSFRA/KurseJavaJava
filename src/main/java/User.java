public class User {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public User(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(",position='").append(position).append('\'');
        sb.append(",email='").append(email).append('\'');
        sb.append(",phone='").append(phone).append('\'');
        sb.append(",salary=").append(salary);
        sb.append(",age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        User[] user = {
                new User("Nikolas", "Boss", "ad@mail.ru", "8999", 100, 55),
                new User("Vano", "HR", "adas@mail.ru", "85599", 150, 49),
                new User("Isaak", "SisAdmin", "af@mail.ru", "8499", 1000, 27),
                new User("Klaus", "Delivery", "ad@mail.ru", "3399", 1300, 22),
                new User("Liam", "QA", "kaad@mail.ru", "5599", 1040, 71),
        };

        for (int i = 0; i < user.length; i++) {
            if (user[i].getAge() > 40) {
                System.out.println(user[i]);
            }


        }
    }
}