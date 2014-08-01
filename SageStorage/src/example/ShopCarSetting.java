package example;

import java.util.ArrayList;

import com.sage.storage.BaseSetting;

public class ShopCarSetting extends BaseSetting {
	public ArrayList<ShopCar> ShopCars = new ArrayList<ShopCar>();

	public static class ShopCar {
		public ShopCar(int id, String title, double price) {
			this.Id = id;
			this.Title = title;
			this.Price = price;
		}

		public int Id;

		public String Title;

		public double Price;
	}
}
