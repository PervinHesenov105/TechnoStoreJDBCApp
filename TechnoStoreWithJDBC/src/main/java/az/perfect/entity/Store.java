/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.entity;

/**
 *
 * @author Perfect
 */
public class Store {

    private int id;
    private String store_name;
    private String location;
    private String phone;

    public Store(int id, String store_name, String location, String phone) {
        this.id = id;
        this.store_name = store_name;
        this.location = location;
        this.phone = phone;

    }

    public Store() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Store{" + "id=" + id + ", store_name=" + store_name + ", location=" + location + ", phone=" + phone + '}';
    }

}
