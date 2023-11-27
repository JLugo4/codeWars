package org.example.CodeWarProblem1;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> filteredList = list.stream()
                .filter(e -> !(e instanceof String))
                .collect(Collectors.toList());
        return filteredList;
    }
}