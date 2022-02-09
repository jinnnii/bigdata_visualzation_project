package aa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String,Person> hMap = new HashMap<String,Person>();
		hMap.put("짱구", new Person("짱구",5,"남자","010-1234-5678"));
		hMap.put("훈이", new Person("훈이",5,"남자","010-5678-6789"));
		hMap.put("철수", new Person("철수",5,"남자","010-1234-7894"));
		hMap.put("맹구", new Person("맹구",5,"남자","010-7894-5612"));
		hMap.put("유리", new Person("유리",5,"여자","010-7789-5678"));
		
		Set<String> keys = hMap.keySet();
		for(String key: keys) {
			System.out.println(key +": "+hMap.get(key));
		}

	}

}
