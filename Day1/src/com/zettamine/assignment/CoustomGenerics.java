package com.zettamine.assignment;

public class CoustomGenerics<E> {
	
	E e;
	public CoustomGenerics(E e) {
		this.e = e;
	}
	public E getData() {
		return e;
	}
	public void setData(E e) {
		this.e = e;
	}
	
	
	@Override
	public String toString() {
		return "CoustomGenerics [e=" + e + "]";
	}
	public static void main(String[] args) {
		
		Student<Number> s1 = new Student<Number>(1, "Mallesh");
		Student<Number> s2 = new Student<Number>(2.0, "Rohit");
		Student<Number> s3 = new Student<Number>(0.76f, "Yuvraj");
		
		
		CoustomGenerics<Student> c1 = new CoustomGenerics<Student>(s1);
		CoustomGenerics<Student> c2 = new CoustomGenerics<Student>(s2);
		CoustomGenerics<Student> c3 = new CoustomGenerics<Student>(s3);
		CoustomGenerics<Integer> c4 = new CoustomGenerics<Integer>(20);
		CoustomGenerics<Double>  c5 = new CoustomGenerics<Double>(77.0);
		
		CoustomGenerics  [] c = {c1,c2,c3,c4,c5};
		
		for(CoustomGenerics<?> coustom : c) {    // unbounded wild card  this represents unknown type
			System.out.println(coustom);
		}
		
		
//		LinkedList<CoustomGenerics<Student>> l1 = new LinkedList<CoustomGenerics<Student>>();
//			l1.add(c1);
//			l1.add(c2);
		
	}

}
