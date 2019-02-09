import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class version {
public static void main(String[] args) {

	List<Map<String, String>> productTypeExtensionsRepresentations = new ArrayList<>();
	productTypeExtensionsRepresentations.add(new HashMap<String, String>(){{put("nome", "Renato");put("Version", "1.0");}});
	productTypeExtensionsRepresentations.add(new HashMap<String, String>(){{put("nome", "Renato2");put("Version", "2.0");}});
	productTypeExtensionsRepresentations.add(new HashMap<String, String>(){{put("nome", "Ever 1");}});
	Double version = 2.0;

Predicate<Map<String, String>> containsVersion = l -> l.containsKey("Version");
Predicate<Map<String, String>> versionIsAcceptable = l ->  new Double (l.get("Version"))<=version;

	productTypeExtensionsRepresentations = productTypeExtensionsRepresentations.stream()
			.filter(containsVersion
					.and(versionIsAcceptable)
					.or((containsVersion).negate()))
			.collect(Collectors.toList());
	System.out.println(productTypeExtensionsRepresentations);
	}
}
