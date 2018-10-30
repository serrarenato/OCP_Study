package enums;

import java.util.EnumSet;
import java.util.Set;

public class EnumTest2 {
	enum Style {
		ITALIC, BOLD, UNDERLINE;
	}

	public static void apply(Set<Style> styles) {
		for (Style style : styles) {
			System.out.println(style);
		}
	}
	public static void main(String[] args) {
		apply(EnumSet.of(Style.BOLD, Style.UNDERLINE));	
	}
	
}
