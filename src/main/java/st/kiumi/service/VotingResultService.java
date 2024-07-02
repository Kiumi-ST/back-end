package st.kiumi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import st.kiumi.domain.VotingResult;
import st.kiumi.dto.VotingResultRequestDto;
import st.kiumi.repository.VotingResultRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class VotingResultService {
    private final VotingResultRepository votingResultRepository;

    @Transactional
    public void createVotingResult(VotingResultRequestDto resultRequestDto) {
        VotingResult votingResult = VotingResult.builder()
                .question1(resultRequestDto.getQuestion1())
                .question2(resultRequestDto.getQuestion2())
                .question3(resultRequestDto.getQuestion3())
                .build();

        votingResultRepository.save(votingResult);
    }
}
