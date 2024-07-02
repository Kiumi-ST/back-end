package st.kiumi.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VotingResultRequestDto {
    private String question1;
    private String question2;
    private String question3;
}
