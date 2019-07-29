package cn.zz.notez.domain.data;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 1可用，0不可用
     */
    private Byte enabled;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 微信openid
     */
    @Column(name = "wx_openid")
    private String wxOpenid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取1可用，0不可用
     *
     * @return enabled - 1可用，0不可用
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * 设置1可用，0不可用
     *
     * @param enabled 1可用，0不可用
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取微信openid
     *
     * @return wx_openid - 微信openid
     */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
     * 设置微信openid
     *
     * @param wxOpenid 微信openid
     */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }
}