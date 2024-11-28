package com.crm.controller;


import com.crm.entity.Post;
import com.crm.repository.CommentRepository;
import com.crm.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private PostRepository postRepository;


    public PostController(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;

    }

    @PostMapping
    public  String createPost(
            @RequestBody Post post
            )
    {
        postRepository.save(post);
        return  "saved";
    }

    @DeleteMapping
    public  void deletepost()
    {
        postRepository.deleteById(1L);
    }

}
