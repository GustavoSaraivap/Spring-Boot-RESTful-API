package com.springcourse.repository;

import com.springcourse.SpringCourseApplication;
import com.springcourse.enums.Role;
import com.springcourse.models.User;
import com.springcourse.repositories.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void AsaveTest() {
        User user = new User(null, "Kevin", "kevin.wing@gmail.com",
                        "123", Role.ADMINISTRATOR, null, null);
        User createdUser = userRepository.save(user);

        assertThat(createdUser.getId()).isEqualTo(createdUser.getId());
    }

    @Test
    public void BupdateTest() {
        User user = new User(1L, "Carlos", "carlos.souza@gmail.com",
                "123", Role.ADMINISTRATOR, null, null);
        User createdUser = userRepository.save(user);
        assertThat(createdUser.getId()).isEqualTo(createdUser.getId());
    }

//    @Test
//    public void CgetByIdTest() {
//        Optional<User> result = userRepository.findById(1L);
//        User user = result.get();
//
//        assertThat(user.getPassword()).isEqualTo(user.getPassword());
//    }

    @Test
    public void DlistTest() {
        List<User> users = userRepository.findAll();

        assertThat(users.size()).isEqualTo(users.size());
    }

//    @Test
//    public void EloginTest() {
//        Optional<User> result = userRepository.login("carlos.souza@outlook.com", "123");
//        User loggedUser = result.get();
//
//        assertThat(loggedUser.getId()).isEqualTo(loggedUser.getId());
//    }

    @Test
    public void FdeleteAllTest() {
        userRepository.deleteAll();
        List<User> users = userRepository.findAll();

        assertThat(users.size()).isEqualTo(0);
    }
}
