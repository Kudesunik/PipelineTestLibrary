package ru.kudesunik.pipelinetestlibrary;

import com.carrotsearch.hppc.ObjectArrayList;

public class PipelineTestLibrary {
	
	public static void test() {
		ObjectArrayList<String> testList = new ObjectArrayList<String>() {{
			add("Success");
		}};
		System.out.println("Test result: " + testList.get(0));
	}
	
	public void testLocal() {
		
	}
	
	public static void main(String[] args) {
		test();
		(new PipelineTestLibrary()).testLocal();
	}
}
