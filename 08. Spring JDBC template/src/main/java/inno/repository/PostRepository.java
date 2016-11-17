package inno.repository;

import inno.model.Post;

import java.util.List;

public interface PostRepository {

    List<Post> findAll();

    Post find(Long id);

    boolean add(Post post);

    boolean remove(Long id);

}