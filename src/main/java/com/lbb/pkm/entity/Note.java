package com.lbb.pkm.entity;

import java.time.LocalDateTime;

public class Note {
    // 字段（属性） - 使用private封装
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    // 无参构造方法
    public Note() {
        this.createTime = LocalDateTime.now();
        this.updateTime = LocalDateTime.now();
    }

    // 带参数的构造方法
    public Note(String title, String content) {
        this(); // 调用无参构造
        this.title = title;
        this.content = content;
    }

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.updateTime = LocalDateTime.now(); // 更新修改时间
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.updateTime = LocalDateTime.now(); // 更新修改时间
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    // 主方法，用于测试
    public static void main(String[] args) {
        // 创建一个 Note 对象
        Note note = new Note("Test Note", "This is a test note content.");

        // 打印初始状态
        System.out.println("Initial Note:");
        System.out.println("Title: " + note.getTitle());
        System.out.println("Content: " + note.getContent());
        System.out.println("Create Time: " + note.getCreateTime());
        System.out.println("Update Time: " + note.getUpdateTime());

        // 修改标题和内容
        note.setTitle("Updated Title");
        note.setContent("Updated content of the note.");

        // 打印更新后的状态
        System.out.println("\nUpdated Note:");
        System.out.println("Title: " + note.getTitle());
        System.out.println("Content: " + note.getContent());
        System.out.println("Update Time: " + note.getUpdateTime());
    }
}