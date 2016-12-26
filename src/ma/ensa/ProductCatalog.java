package ma.ensa;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
	public List<String> getCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
}
