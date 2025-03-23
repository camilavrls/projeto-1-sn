package backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/data")
public class DataController {
    @GetMapping
    public Map<String, Object> getData() {
        return Map.of(
            "nome", "Maria",
            "idade", 29,
            "estadoCivil", "solteira"
        );
    }
}