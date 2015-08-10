package org.jhouse.ose3_test_sample.repo;

import java.util.List;

import org.jhouse.ose3_test_sample.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
