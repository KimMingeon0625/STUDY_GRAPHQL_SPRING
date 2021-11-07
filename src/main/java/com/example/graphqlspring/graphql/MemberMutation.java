package com.example.graphqlspring.graphql;

import java.util.Optional;

import com.example.graphqlspring.domain.Member;
import com.example.graphqlspring.domain.Role;
import com.example.graphqlspring.dto.MemberDto;
import com.example.graphqlspring.repository.MemberRepository;
import com.example.graphqlspring.repository.RoleRepository;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Transactional
public class MemberMutation implements GraphQLMutationResolver {

    private final MemberRepository memberRepository;

    private final RoleRepository roleRepository;

    public MemberDto createMember(MemberDto memberDto) {
        Member member = memberRepository.save(Member.builder()
                                                    .loginId(memberDto.getLoginId())
                                                    .name(memberDto.getName())
                                                    .password(memberDto.getPassword())
                                                    .build());
        return MemberDto.from(member);
    }

    public Boolean deleteMember(int id){
        Optional<Member> optionalMember = memberRepository.findById(id);
        Role role = roleRepository.findByMemberId(id);
        if(optionalMember.isPresent()) {
            roleRepository.delete(role);
            memberRepository.delete(optionalMember.get());
        }
        return true;
    }
}
