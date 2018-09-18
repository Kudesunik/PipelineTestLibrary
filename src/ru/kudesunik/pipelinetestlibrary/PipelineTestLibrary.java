package ru.kudesunik.pipelinetestlibrary;

import com.carrotsearch.hppc.ObjectArrayList;

public class PipelineTestLibrary {
	
	public static void test() {
		ObjectArrayList<String> testList = new ObjectArrayList<String>() {{
			add("Success");
		}};
		System.out.println("Test result: " + testList.get(0));
	}
}
