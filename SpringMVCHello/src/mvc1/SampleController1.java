package mvc1;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController1 {
	@RequestMapping(value="/hello")
	public String Hello(){
		return "Hello";
	}
}
