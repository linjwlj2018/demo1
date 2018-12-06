package dessert;


import org.springframework.stereotype.Component;

@Component
@Cold

public class IceCream implements Dessert {

	@Override
	public void delicious() {
		System.out.println("I'm IceCream ,I'm delicious.");

	}

}
