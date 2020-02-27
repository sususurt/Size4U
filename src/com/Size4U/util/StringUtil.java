package com.Size4U.util;

/**
 * String Utility class
 * @author Ruitong.Su
 *
 */
public class StringUtil {
	
	/**
	 * Determines if the string is empty
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str == null || "".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Determines if the string is empty
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		if (str != null && "".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}

}
