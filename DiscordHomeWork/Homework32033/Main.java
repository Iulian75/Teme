package Teme.DiscordHomeWork.Homework32033;

import java.util.ArrayList;
import java.util.List;

import static Teme.DiscordHomeWork.Homework32033.PersonFilter.filterAndSortPersons;

public class Main {


    //-Given a list of Person objects with age and city attributes, filter out people younger
    // than 18 or those who live in the city "Metropolis", then return a list of names of the
    // remaining people, sorted in reverse order.

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Maria", 20, "Gotham"));
        persons.add(new Person("Ana", 17, "Metropolis"));
        persons.add(new Person("Ioana", 22, "Star City"));
        persons.add(new Person("George", 18, "Metropolis"));
        persons.add(new Person("Eve", 25, "Gotham"));

        List<String> filteredNames =  filterAndSortPersons(persons);



        System.out.println("Filtered and sorted names: " + filteredNames);
    }



    //-Using https://www.w3schools.com/sql/sql_insert.asp, write sql scripts to
    // insert/select/update/delete elements from a table with name Product and fields: name, price,
    // tva. (1 script for every command: insert/select/update/delete)

    //-- insert.sql
    //INSERT INTO Product (name, price, tva) VALUES ('Camasa', 410, 60);
    //INSERT INTO Product (name, price, tva) VALUES ('Pantaloni', 599.99, 80);
    //INSERT INTO Product (name, price, tva) VALUES ('Blugi', 399.99, 70);

    //-- select.sql
    //SELECT * FROM Product;

    //UPDATE Product
    //SET price = 310
    //WHERE name = 'Camasa';

    //-- delete.sql
    //DELETE FROM Product
    //WHERE name = 'Blugi';


}
