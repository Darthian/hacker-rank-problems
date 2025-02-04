package service;

import model.DummyStructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalImplementations {

    public static String getStructuresSorted() {

        List<DummyStructure> dummyStructures = Arrays.asList(
                new DummyStructure("100", "John Doe", "",30, 1000, 10.00, new int[]{10, 11, 12}),
                new DummyStructure("20", "John Doe", "",30, 1000, 10.00, new int[]{10, 11, 12}),
                new DummyStructure("300", "John Sanchez", "",30, 1000, 10.00, new int[]{10, 11, 12}),
                new DummyStructure("14", "John Sanchez", "",30, 1000, 10.00, new int[]{10, 11, 12}),
                new DummyStructure("5", "John Perez", "",30, 1000, 10.00, new int[]{10, 11, 12}));


        Collections.sort(dummyStructures, new Comparator<DummyStructure>() {
            @Override
            public int compare(DummyStructure o1, DummyStructure o2) {
                return o1.name().compareTo(o2.name());
            }
        });

        //Summarize of Sanchez:
        int summarize = dummyStructures.stream()
                .filter(structure -> structure.name().contains("Sanchez"))
                .map(DummyStructure::number).mapToInt(Integer::intValue).sum();

        return String.valueOf(summarize);
    }
}
