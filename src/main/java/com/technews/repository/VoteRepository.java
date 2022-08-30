package com.technews.repository;

import com.technews.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.From;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Integer> {
    //Next, let's add the instance-level annotation, @Query
    @Query("SELECT count(*) FROM Vote v where v.postId = :id")
    int countVoteByPostId(@Param("id") Integer id);
}
