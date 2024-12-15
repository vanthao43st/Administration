package com.example.administration.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * JsonInclude NON_NULL: giúp cho những thuộc tính nào có giá trị là null sẽ không xuất hiện trong file json
 *
 * @param <T>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data // tự động tạo các phương thức getter, setter, toString, hash, ...
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    @Builder.Default
    int code = 1000;

    String message;

    T result;
}
