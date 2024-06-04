package st.kiumi.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

    private Boolean isSuccess;
    private String msg;

}
