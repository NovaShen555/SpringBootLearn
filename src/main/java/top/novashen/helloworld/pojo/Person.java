package top.novashen.helloworld.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
    private Dog dog;
}
