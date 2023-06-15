package data;

import java.util.ArrayList;
import java.util.Date;

public class BeanTest {


    public static void main(String[] args) {
        Album album1 = new Album();
        Quote quote1 = new Quote();
        Author author1 = new Author();
        Date releaseDate1 = new Date("November 4, 2003");
        Album album2 = new Album();
        Quote quote2 = new Quote();
        Author author2 = new Author();
        Date releaseDate2 = new Date("June 15, 2011");
        Album album3 = new Album();
        Quote quote3 = new Quote();
        Author author3 = new Author();
        Date releaseDate3 = new Date("January 25, 2007");

        author1.setId(1);
        author1.setFirstName("Azar");
        author1.setLastName("Nafisi");
        author2.setId(2);
        author2.setFirstName("Yuval");
        author2.setLastName("Noah Harari");
        author3.setId(3);
        author3.setFirstName("Miguel");
        author3.setLastName("Ruiz");

        quote1.setId(1);
        quote1.setAuthor(author1);
        quote1.setContent("You get a strange feeling when you're about to leave a place...like you'll not only miss the people you love but you'll miss the person you are now at this time and this place, because you'll never be this way ever again.");
        quote2.setId(2);
        quote2.setAuthor(author2);
        quote2.setContent("The world does not revolve around humans or around any other particular group of beings.");
        quote3.setId(3);
        quote3.setAuthor(author3);
        quote3.setContent("Whatever happens around you, don't take it personally... Nothing other people do is because of you. It is because of themselves.");

        album1.setId(1);
        album1.setArtist("Metallica");
        album1.setAlbum("Death Magnetic");
        album1.setRelease_date(releaseDate1);
        album1.setSales(9.2);
        album1.setGenre("Rock");
        album2.setId(2);
        album2.setArtist("Madonna");
        album2.setAlbum("Like a Prayer");
        album2.setRelease_date(releaseDate2);
        album2.setSales(5.9);
        album2.setGenre("Pop");
        album3.setId(3);
        album3.setArtist("Eric Clapton");
        album3.setAlbum("Slow Hand");
        album3.setRelease_date(releaseDate3);
        album3.setSales(12.2);
        album3.setGenre("Rock");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for (Quote quote : quotes) {
            System.out.printf("%s %s said: %s %n",
                    quote.getAuthor().getFirstName(),
                    quote.getAuthor().getLastName(),
                    quote.getContent());
        }

    }
}
