package st.kiumi.dto;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class SurveyResultRequestDto {


    private Float q1;

    private String q2;

    private String q3;

    private String q4;

    private String q5;
}
