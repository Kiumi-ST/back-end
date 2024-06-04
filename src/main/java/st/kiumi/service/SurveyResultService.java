package st.kiumi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import st.kiumi.domain.SurveyResult;
import st.kiumi.dto.SurveyResultRequestDto;
import st.kiumi.repository.SurveyResultRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SurveyResultService {
    private final SurveyResultRepository surveyResultRepository;

    @Transactional
    public void createSurveyResult(SurveyResultRequestDto resultRequestDto){
        SurveyResult surveyResult = SurveyResult.builder()
                .question1(resultRequestDto.getQ1())
                .question2(resultRequestDto.getQ2())
                .question3(resultRequestDto.getQ3())
                .question4(resultRequestDto.getQ4())
                .question5(resultRequestDto.getQ5())
                .question6(resultRequestDto.getQ6())
                .build();

        surveyResultRepository.save(surveyResult);

    }

}
