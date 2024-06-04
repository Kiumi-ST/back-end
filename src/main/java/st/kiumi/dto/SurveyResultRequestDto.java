package st.kiumi.dto;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class SurveyResultRequestDto {


    private String q1;

    private Float q2;

    private String q3;

    private String q4;

    private String q5;

    private String q6;
}
