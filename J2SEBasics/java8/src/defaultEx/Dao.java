package defaultEx;

public interface Dao {
		void login();
		void logout();
		
    public default void forget_Password() {
    	System.out.println("Forget Password");
    }
}


//By default interface methods are public and abstract

//Problem St: If you want enhance interface functionality?


//With out effecting/distrubing implementation classes funciton?
// if you wnat enhance interface funcitonalty - go with default methods

