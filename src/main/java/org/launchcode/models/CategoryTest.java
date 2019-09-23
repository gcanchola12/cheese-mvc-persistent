package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class CategoryTest {
    @Id
    @GeneratedValue
    private int id;

}