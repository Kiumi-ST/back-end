package st.kiumi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.kiumi.dto.ResponseDto;
import st.kiumi.dto.SurveyResultRequestDto;
import st.kiumi.service.SurveyResultService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey")
public class SurveyController {

    private final SurveyResultService surveyResultService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> createSurveyResult(@RequestBody SurveyResultRequestDto resultRequestDto){
        surveyResultService.createSurveyResult(resultRequestDto);

        ResponseDto responseDto = ResponseDto.builder()
                .isSuccess(Boolean.TRUE)
                .msg("개선점 설문 결과 저장 완료")
                .build();

        return ResponseEntity.ok(responseDto);
    }


}
