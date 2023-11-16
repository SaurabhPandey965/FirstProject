package program;

     interface A {
	
		default void print() {
		System.out.println("Method of A");
		}
		}

		 

		interface B {
		default void print() {
		System.out.println("Method of B");
		}
		}

		 

   class Test implements B, A {

		 

		
		@Override
		public void print() {
			// TODO Auto-generated method stub
			A.super.print();
		}

		public static void main(String[] args) {
			Test obj = new Test();
             obj.print();
		} 

		
		}

