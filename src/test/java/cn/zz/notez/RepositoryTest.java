package cn.zz.notez;

import cn.zz.notez.domain.User;
import cn.zz.notez.domain.UserEntity;
import cn.zz.notez.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * TODO
 *
 * @author: zz
 * @date: 2020/7/3 17:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
        User user1 = userRepository.findById(1);
        System.out.println("user：" + user1);

        List<User> userList = userRepository.listAll();
        System.out.println("userList：" + userList);

        user1.setId(null);
        userRepository.save(user1);
    }

}
