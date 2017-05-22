package robert.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class ElementFactory {

	private static final Map<String, Element> elementMap = new ConcurrentHashMap<>();

	public static Element getElement(String name) {
		Element element = elementMap.get(name);
		if ( element == null ) {
			element = new ElementImpl(name);
			elementMap.put(name, element);
		}
		return element;
	}

	public static int getElementsMapSize() {
		return elementMap.size();
	}

}
