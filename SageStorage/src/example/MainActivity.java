package example;

import com.sage.storage.R;
import com.sage.storage.R.layout;
import com.sage.storage.R.menu;
import com.sage.storage.StorageSetting;
import com.sage.storage.exceptions.StorageNewInstanceException;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);        
                
        settings();
    }


	private void settings() throws StorageNewInstanceException {
		ShopCarSetting shopCar = StorageSetting.Get(ShopCarSetting.class);
		shopCar.ShopCars.add(new ShopCar(1, "Car", 100));
		StorageSetting.Set(shopCar);
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
