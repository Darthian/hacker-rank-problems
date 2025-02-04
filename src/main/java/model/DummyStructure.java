package model;

import java.util.Arrays;

public record DummyStructure(
    String id,
    String name,
    String email,
    Integer age,
    int number,
    double price,
    int[] numbers
) {
    public DummyStructure {

    }

    public static DummyStructure mapUserToUserDto(DummyStructure user) {
        return new DummyStructure(user.id(), user.name(), user.email(), user.age(), user.number(), user.price(), user.numbers());
    }

    @Override
    public String toString() {
        return "DummyStructure{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
