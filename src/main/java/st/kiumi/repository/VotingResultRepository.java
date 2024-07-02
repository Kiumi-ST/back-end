package st.kiumi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import st.kiumi.domain.VotingResult;

public interface VotingResultRepository extends JpaRepository<VotingResult, Integer> {
}
