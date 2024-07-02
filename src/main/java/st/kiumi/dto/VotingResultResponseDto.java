package st.kiumi.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VotingResultResponseDto {
    private Boolean isSuccess;
    private String msg;
}
