import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringFrameworkExampleApp {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringFrameworkExampleApp.class, args);
    }
}

@RestController
class HelloReaderController {
    
    @GetMapping("/")
    public String helloReader() {
        return "Hello, Reader!";
    }
}
