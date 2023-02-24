/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;

import az.perfect.entity.User;
import java.util.List;

/**
 *
 * @author betul
 */
public interface UserDaoInter {
    void insert(User p);

    void update(User p);

    void delete(int id);

    List<User> getAllUsers();

    User getUserById(int id);
}
