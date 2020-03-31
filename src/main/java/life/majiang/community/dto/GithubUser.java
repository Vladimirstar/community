package life.majiang.community.dto;


import lombok.Data;

@Data
public class GithubUser {

    private String name;
    private Long id;
    private String bio;
    private String createdAt;
    private String login;
    private String avatarUrl;

}
