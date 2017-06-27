package shop.retail.service.shop;

import com.google.maps.model.LatLng;
import shop.retail.datastore.ShopInMemoryArray;
import shop.retail.models.Shop;
import java.util.List;


/**
 * This is a interface that has following methods
 * @author Sangram
 *
 */
public interface ShopLocator {

	void save(Shop shop);
	Shop findNearest(LatLng location);
	List<Shop> getAll();
	ShopInMemoryArray getInMemoryArray();
	void setInMemoryArray(ShopInMemoryArray inMemoryArray);
}
