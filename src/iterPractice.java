import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

    public static void main(String[] args)
    {
        ArrayList<String> books = new ArrayList<String>();

        ///Collections.addAll(books, "The Hobbit", "1984", "Brave New World");
        books.add("The Hobbit");
        books.add("1984");
        books.add("Brave new World");

        Iterator<String> it = books.iterator();

        while (it.hasNext())
        {
            String book = it.next();
            if(book.equals("The Hobbit"))
            {
                it.remove();
            }
            System.out.println(books);
        }

    }