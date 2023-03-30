
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree familyTolstoy = new FamilyTree();
        Scanner scn = new Scanner(System.in);
        List<Person> family = new ArrayList<>();
        int key = 0;
        String namefather;
        int i = 0;

        while (key != 4) {
            System.out.println(
                    " Введите:\n 0 - Вывести список членов семьи\n 1 - Добавить члена семьи\n 2 - Загрузить семью из файла\n 3 - Вывести детей члена семьи \n 4 - Выйти");
            key = scn.nextInt();
            switch (key) {
                case 0:
                    System.out.println("Семья состоит из:");
                    for (Person person : family) {

                        System.out.println(person);
                    }
                    break;
                case 1:
                    family.add(new Person());
                    i = family.size() - 1;
                    System.out.println("Введите ФИО:");
                    family.get(i).setFio(scn.next());

                    System.out.println("Введите Отца:");
                    namefather = scn.next();

                    for (Person person : family) {
                        if (person.getFio().equals(namefather)) {
                            person.addChild(family.get(i));
                        }
                    }
                    System.out.println(family);
                    break;

                case 2:
                    // Востановление из файла с помощью класса ObjectInputStream
                    ObjectInputStream objectInputStream = new ObjectInputStream(
                            new FileInputStream("person.out"));
                    List<Person> RestoredPeople = (List<Person>) objectInputStream.readObject();
                    objectInputStream.close();
                    family.addAll(RestoredPeople);
                    System.out.println(RestoredPeople);
                    
                    break;

                case 3:
                    System.out.println("Введите имя Отца:");
                    namefather = scn.next();
                    boolean found = false;
                    for (Person person : family) {
                        if (person.getFio().equals(namefather)) {
                            System.out.println("Дети отца " + namefather + " :" + person.getChildren());
                            found = true;
                            break;
                        }
                        if (!(found)) {
                            System.out.println("Отец не найден");
                        }
                    }
                    break;
                case 4:
                    // Сериализация в файл с помощью класса ObjectOutputStream
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.out"));
                    objectOutputStream.writeObject(family);
                    objectOutputStream.close();
                    scn.close();
                    break;
                default:
                    break;
            }
        }

        /*
         * Member member1 = new Member(1685, 1728, "Иван Петрович Толстой", Gender.Male,
         * null, null);
         * Member member2 = new Member(1693, 1748, "Прасковья Михайловна Ртищева",
         * Gender.Female, null, null);
         * Member member3 = new Member(1727, 1811, "Александра Ивановна Щетинина",
         * Gender.Female, member1, member2);
         * Member member4 = new Member(1721, 1803, "Андрей Иванович Толстой",
         * Gender.Male, member1, member2);
         * Member member5 = new Member(1724, 1811, "Николай Иванович Горчаков",
         * Gender.Male, member1, member2);
         * Member member6 = new Member(1757, 1820, "Прасковья Васильевна Толстая",
         * Gender.Female, null, null);
         * Member member7 = new Member(1757, 1820, "Илья Андреевич Толстой",
         * Gender.Male, member4, null);
         * Member member8 = new Member(1757, 1820, "Полагея Николаевна Горчакова",
         * Gender.Female, member5, null);
         */

        // List<Member> members = new ArrayList(Arrays.asList(member1, member2, member3,
        // member4, member5, member6, member7, member8));
        familyTolstoy.addAllMember(family);

        // System.out.println("Члены семьи: " + familyTolstoy);

        // System.out.println("Дети :" + member1.getChildren());

    }
}
