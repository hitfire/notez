package cn.zz.notez.repository;

import cn.zz.notez.domain.User;
import cn.zz.notez.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TODO
 *
 * @author: zz
 * @date: 2020/7/2 18:05
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findById(int id);

    @Query("from User")
    List<User> listAll();
}
