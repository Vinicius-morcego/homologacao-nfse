package com.viniciusdev.nfse.infrastructure.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtils {

	public static String removerMascara(String string) {
		return string.replaceAll("[^//d]", "");
	}
}
