package edu.sjsu.cmpe275.web.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.sjsu.cmpe275.domain.entity.User;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.Set;

@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HackathonResponseDto {

    @JsonProperty("id")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("startDate")
    private java.util.Date startDate;

    @JsonProperty("endDate")
    private java.util.Date endDate;

    @JsonProperty("fee")
    private Float fee;

    @JsonProperty("minSize")
    private int minSize;

    @JsonProperty("maxSize")
    private int maxSize;

    @JsonProperty("Judgesss")
    private Set<User> judges;

//    @JsonProperty(value = "address")
//    private AddressResponseDto address;

}