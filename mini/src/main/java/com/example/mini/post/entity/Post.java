package com.example.mini.post.entity;

import com.example.mini.board.entity.Board;
import com.example.mini.comment.entity.Comment;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //게시판
    @ManyToOne
    @JoinColumn
    private Board board;

    private String title;
    private String content;
    private String password;

    @OneToMany(mappedBy = "post")
    private List<Comment> comment;



}
