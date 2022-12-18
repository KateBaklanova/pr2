import java.util.Scanner;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("input author's name: ");
        String n = in.nextLine();
        System.out.print("input author's gender: ");
        char sex = in.next().charAt(0);
        if (sex != 'F' && sex != 'M')
        {
            sex = 'U';
        }

        in.nextLine(); // чтобы считать \n
        System.out.print("input author's email: ");
        String e = in.nextLine();

        Author person = new Author (n, e, sex);

        System.out.println(person);

        System.out.print("set a new email ");
        e = in.nextLine();
        person.setEmail(e);

        System.out.println(person);

    }
}
