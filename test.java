public class test {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		//создаем HashSet
		set.put(2);
		//добавляем элемент
		System.out.println("1 - "+set.contains(2));
		//проверяем, содержится ли он в HashSet (должно вернуть true) (цифра 1)
		set.remove(2);
		//удаляем тот же элемент
		System.out.println("2 - "+set.contains(2));
		//проверяем, содержится ли он в HashSet (должно вернуть false) (цифра 2)
		set.put(3);
		//добавляем новый элемент
		System.out.println("3 - "+set.contains(3));
		//проверяем его наличие (должно вернуть true) (цифра 3)
		set.remove(7);
		//удаляем элемент, которого не существует, чтобы проверить метод remove
		//должна вывестись надпись: "There is no such element, there is nothing to delete"
	}
}
