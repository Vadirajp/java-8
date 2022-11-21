Lambda is equivalent to a function (method) without name.
Lambda is also referred as anonymous functions.
    - Method parameters.
    - Method body.
    - Return Type.

Lambda can also be assigned to variable and passed around.

Syntax : 
         ( )               ->             {}
    input Parameter       Arrow       Lambda Body

Mainly used to implement FunctionalInterface (SAM - Single abstract method).

Example : 
1.  


    @FunctionalInterface
    public interface Comparator<T>{

        int compare(T o1,To2);
    }

2. 


    @FunctionalInterface
    Public interface Runnable{
        public abstract void run();
    }

