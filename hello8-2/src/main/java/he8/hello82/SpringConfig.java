package he8.hello82;

import he8.hello82.controller.MemberController;
import he8.hello82.repository.MemberRepository;
import he8.hello82.repository.MemoryMemberRepository;
import he8.hello82.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
