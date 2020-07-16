package cn.zz.notez.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * TODO
 *
 * @author: zz
 * @date: 2020/7/3 17:48
 */
@Entity
@Table(name = "user", schema = "notez", catalog = "")
public class UserEntity {
    private int id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private byte enabled;
    private String nickname;
    private String avatar;
    private String wxOpenid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "enabled")
    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "wx_openid")
    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                enabled == that.enabled &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(wxOpenid, that.wxOpenid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, updateTime, enabled, nickname, avatar, wxOpenid);
    }
}
