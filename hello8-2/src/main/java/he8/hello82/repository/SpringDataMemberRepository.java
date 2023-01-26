package he8.hello82.repository;

import he8.hello82.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataMemberRepository extends JpaRepository<Member, Long> ,MemberRepository{
    @Override
    Optional<Member> findByName(String name);
}
