package obj;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//동일한 주소값인지 확인
		if (this == obj)
			return true;
		//해시코드 확인
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		//Person 형변환이 되는지 확인
		Person other = (Person) obj;
		if(obj instanceof Person) {
			Person p = (Person) obj;
			//이름 비교 - 서로 다르면 바로 return false 결과값 리턴
			if(!p.name.equals(name)) return false; 
			//나이 비교 - 서로 다르면 바로 return false 결과값 리턴
			if(p.age != age) return false; 
			return true;
		}
		return false;
	}
	
	
}
