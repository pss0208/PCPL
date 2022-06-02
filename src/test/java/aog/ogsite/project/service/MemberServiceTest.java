package aog.ogsite.project.service;

import aog.ogsite.project.domain.Member;
import aog.ogsite.project.repository.MemberRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberServiceImpl memberServiceImpl;

    @Autowired
    MemberRepository memberRepository;


    @Test
    public void 멤버_찾기() throws Exception {
        Member member1 = new Member();
        member1.setName("kim");
        Member member2 = new Member();
        memberRepository.save(member1);

        member2 = memberRepository.findById(1L).get();

        Assertions.assertEquals(member1, member2);

    }
}