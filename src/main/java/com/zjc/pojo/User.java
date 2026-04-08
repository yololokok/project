package com.zjc.pojo;

// 对应数据库的 users 表
public class User {
    private Integer id;
    private String username;
    private String password;
    // 省略了 createTime，演示核心逻辑

    // 必须有无参构造
    public User() {}

    // Getter 和 Setter 方法 (可以用 Lombok 的 @Data 注解自动生成)
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}