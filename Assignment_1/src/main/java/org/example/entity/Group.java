package org.example.entity;

import java.time.LocalDate;
public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createDate;
    Account[] accounts;

}
