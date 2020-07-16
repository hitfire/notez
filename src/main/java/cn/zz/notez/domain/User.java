package cn.zz.notez.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * TODO
 *
 * @author: zz
 * @date: 2020/7/3 17:19
 */
@Data
@Entity
@Table(name = "user", schema = "notez", catalog = "")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Column(name = "enabled", nullable = false)
    private Byte enabled;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "avatar", nullable = true)
    private String avatar;

    @Column(name = "wx_openid", nullable = true)
    private String wxOpenid;

}
