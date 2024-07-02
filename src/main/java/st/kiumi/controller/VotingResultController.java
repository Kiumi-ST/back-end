package st.kiumi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.kiumi.dto.VotingResultRequestDto;
import st.kiumi.dto.VotingResultResponseDto;
import st.kiumi.service.VotingResultService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/votingresult")
public class VotingResultController {

    private final VotingResultService votingResultService;

    @PostMapping("")
    public ResponseEntity<VotingResultResponseDto> createVotingResult(@RequestBody VotingResultRequestDto resultRequestDto) {
        votingResultService.createVotingResult(resultRequestDto);

        VotingResultResponseDto responseDto = VotingResultResponseDto.builder()
                .isSuccess(Boolean.TRUE)
                .msg("개선안 vs 원본 투표 결과 저장 완료")
                .build();

        return ResponseEntity.ok(responseDto);
    }
}
