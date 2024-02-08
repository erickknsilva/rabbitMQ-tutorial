package net.javaguides.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    private int id;

    private String name;
    private String email;


    @Override
    public String toString() {
        return "MenuOrder" +
                ", id:" + id +
                ", name:" + name +
                ", email:'" + email;
    }

}
