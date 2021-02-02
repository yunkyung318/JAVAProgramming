package PairMapInheritance;

class Dictionary extends PairMap {
	private int index;

	public Dictionary(int size) {
		keyArray = new String[size];
		valueArray = new String[size];
		index = 0;
	}

	@Override
	String get(String key) {
		for (int i = 0; i < index; i++) {
			if (key.equals(keyArray[i]))
				return valueArray[i];
		}
		return null;
	}
	
	@Override
	void put(String key, String value) {
		for (int i = 0; i < index; i++) {
			if (key.equals(keyArray[i])) {
				valueArray[i] = value;
			}

		}
		keyArray[index] = key;
		valueArray[index] = value;
		index++;
	}

	@Override
	String delete(String key) {
		for (int i = 0; i < index; i++) {
			if (key.equals(keyArray[i])) {
				String re = valueArray[i];
				keyArray[i] = null;
				valueArray[i] = null;
				return re;
			}
		}
		return null;
	}

	@Override
	int length() {
		return index;
	}

}

public class DictionaryAppEx {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");

		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}

}
