package dessert;

import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {

	
	@Override
	public void delicious() {
		System.out.println("I'm cookies , I'm delicious!");

	}

}
