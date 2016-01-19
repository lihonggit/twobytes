package basic.utils;

import java.util.UUID;

public class UUIDUtils {
	
	/**
	 * 生成一个32位的唯一字符，用于作为ID
	 * @return
	 */
	public static String getUUID32() {
		UUID uuid = UUID.randomUUID(); 
		return uuid.toString().replace("-", "");
	}
}
