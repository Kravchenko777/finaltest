package com.max;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        List<ALibraryObject> reestr = new ArrayList<>();
        reestr.add(new Book(100, "Книга 1", new Author("Имя1", "Фамилия1"), 2013));
        reestr.add(new Book(101, "Книга 2", new Author("Имя2", "Фамилия2"), 2023));
        reestr.add(new Book(102, "Книга 3", new Author("Имя1", "Фамилия1"), 2003));

        reestr.add(new Journal(103, "Журнал 1", new Author("Имя2", "Фамилия2"), 2));
        reestr.add(new Journal(104, "Журнал 2", new Author("Имя3", "Фамилия3"), 6));

        SearchService searchService = new SearchService(reestr);

        System.out.println(searchService.search(102));
        System.out.println(searchService.search("Имя2 "+"Фамилия2"));

    }
}
