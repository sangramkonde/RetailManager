package shop.retail.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 
 * Represents a Shop located across the geographical region.
 * A shop can be registered on the basis on address, name, number and postcode .
 *
 * @author Sangram
 *
 */
public class Shop {
	
	private String shopName;
	@NotNull
	private ShopAddress shopAddress;
	private Double shopLatitude;
	private Double shopLongitude;

	/**
	 * Gets the name of the shop
	 * @return shopName.
	 */	
	public String getShopName() {
		return shopName;
	}

	/**
	 * Sets the name of the shop.
	 * @param shopName
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * Gets the address of the shop
	 * @return shopAddress.
	 */	
	public ShopAddress getShopAddress() {
		return shopAddress;
	}

	/**
	 * Sets the address of the shop.
	 * @param shopAddress
	 */
	public void setShopAddress(ShopAddress shopAddress) {
		this.shopAddress = shopAddress;
	}

	/**
	 * Gets the latitude of the shop
	 * @return shopLatitude.
	 */	
	public Double getShopLatitude() {
		return shopLatitude;
	}

	/**
	 * Sets the latitude of the shop.
	 * @param shopLatitude
	 */
	public void setShopLatitude(Double shopLatitude) {
		this.shopLatitude = shopLatitude;
	}

	/**
	 * Gets the longitude of the shop
	 * @return shopLongitude.
	 */	
	public Double getShopLongitude() {
		return shopLongitude;
	}

	/**
	 * Sets the longitude of the shop.
	 * @param shopLongitude
	 */
	public void setShopLongitude(Double shopLongitude) {
		this.shopLongitude = shopLongitude;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Shop shop = (Shop) o;

		if (!shopName.equals(shop.shopName))
			return false;
		if (shopAddress != null
				&& !shopAddress.getNumber()
						.equals(shop.shopAddress.getNumber())
				&& this.shopAddress.getPostCode() != shop.shopAddress
						.getPostCode())
			return false;
		if (shopLatitude.doubleValue() != shop.shopLatitude.doubleValue())
			return false;
		return shopLongitude.doubleValue() == shop.shopLongitude.doubleValue();
	}

	@Override
	public int hashCode() {
		int result = shopName.hashCode();
		result = 31 * result
				+ (shopAddress != null ? shopAddress.hashCode() : 0);
		result = 31 * result
				+ (shopLatitude != null ? shopLatitude.hashCode() : 0);
		result = 31 * result
				+ (shopLongitude != null ? shopLongitude.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Shop{" + "shopName='" + shopName + '\'' + ", shopAddress="
				+ shopAddress + ", shopLatitude=" + shopLatitude
				+ ", shopLongitude=" + shopLongitude + '}';
	}

	
	public static class ShopAddress {
		@NotNull
		private String number;
		@Min(1)
		private int postCode;

		public ShopAddress() {
			// default no-argument constructor
		}

		public ShopAddress(String number, int postCode) {
			this.number = number;
			this.postCode = postCode;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public int getPostCode() {
			return postCode;
		}

		public void setPostCode(int postCode) {
			this.postCode = postCode;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;

			ShopAddress that = (ShopAddress) o;

			if (number != null && !number.equals(that.number))
				return false;
			return postCode == that.postCode;
		}

		@Override
		public int hashCode() {
			int result = number != null ? number.hashCode() : 0;
			result = 31 * result + postCode;
			return result;
		}

		@Override
		public String toString() {
			return "ShopAddress{" + "number='" + number + '\'' + ", postCode="
					+ postCode + '}';
		}
	}
}
