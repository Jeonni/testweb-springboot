package com.testweb.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// DB 접근, 도메인 객체를 DB에 저장하고 관리
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
