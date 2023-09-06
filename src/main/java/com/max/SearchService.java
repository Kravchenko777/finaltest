package com.max;

import java.util.List;
import java.util.stream.Collectors;

public class SearchService {

    private List<ALibraryObject> library;

    public SearchService(List<ALibraryObject> library) {
        this.library = library;
    }


    public List<ALibraryObject> search(int number) {
        return library
                .stream()
                .filter(e -> e.getNumber() == number)
                .collect(Collectors.toList());
    }

    public List<ALibraryObject> search(int number, String author) {
        return library
                .stream()
                .filter(e -> e.getNumber() == number)
                .filter(e -> e.getAuthor().getFullName().equals(author))
                .collect(Collectors.toList());
    }

    public List<ALibraryObject> search(String author) {
        return library
                .stream()
                .filter(e -> e.getAuthor().getFullName().equals(author))
                .collect(Collectors.toList());
    }
}
