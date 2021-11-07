package com.example.graphqlspring.graphql;

import com.example.graphqlspring.domain.Member;
import com.example.graphqlspring.dto.MemberDto;
import com.example.graphqlspring.repository.MemberRepository;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Transactional
public class MemberQuery implements GraphQLQueryResolver {

    private final MemberRepository memberRepository;

    public MemberDto getMember(int id) {
        Member member = memberRepository.findById(id)
                                        .orElse(null);
        return MemberDto.from(member);
    }
}
