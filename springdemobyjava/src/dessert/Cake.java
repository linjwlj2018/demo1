package dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cake1")
public class Cake implements Dessert {

	@Override
	public void delicious() {
		System.out.println("I'm Cake,I'm delicious¡­");
	}

}
