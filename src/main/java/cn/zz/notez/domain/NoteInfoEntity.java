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
@Table(name = "note_info", schema = "notez", catalog = "")
public class NoteInfoEntity {
    private int id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private byte enabled;
    private String title;
    private String content;
    private int creator;

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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "creator")
    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteInfoEntity that = (NoteInfoEntity) o;
        return id == that.id &&
                enabled == that.enabled &&
                creator == that.creator &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, updateTime, enabled, title, content, creator);
    }
}
