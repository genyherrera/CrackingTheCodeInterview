package com.genyherrera.crackingthecodeinterview.interviewquestions;

public class PrivateConstructor {
	
	private PrivateConstructor() {
		System.out.println("PrivateConstructor");
	}
	
	class PrivateConstructor2 {
		private PrivateConstructor2() {
			System.out.println("PrivateConstructor2");
		}
		
		class PrivateConstructor3 {
			public PrivateConstructor3() {
				PrivateConstructor pc = new PrivateConstructor();
			}
		}
	}

}
