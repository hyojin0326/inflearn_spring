package he8.hello82;

import he8.hello82.repository.JpaMemberRepository;
import he8.hello82.repository.MemberRepository;
import he8.hello82.repository.MemoryMemberRepository;
import he8.hello82.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    /*private DataSource dataSource;

    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }
    */

    /*private EntityManager em;
    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

    private final MemoryMemberRepository memberRepository;
    @Autowired
    public SpringConfig(MemoryMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    //@Bean
    //public MemberRepository memberRepository(){
        //return new JdbcMemberRepository(dataSource);
        //return하는 부분을 MemoryMemberRepository 가 아닌 JdbcMemberRepository로 변경하여
        // 다른 코드를 건드리지 않고도 가능함을 알수 있다.
        //return new JdbcMemberRepository(dataSource);
        //return new JpaMemberRepository(em);
    //}
}
