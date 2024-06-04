package st.kiumi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import st.kiumi.domain.SurveyResult;

public interface SurveyResultRepository extends JpaRepository<SurveyResult, Integer> {
}
