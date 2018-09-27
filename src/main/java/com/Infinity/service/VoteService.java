package com.Infinity.service;

import com.Infinity.domain.Vote;

public interface VoteService {

    Vote getVoteById(Long id);

    void removeVote(Long id);
}
