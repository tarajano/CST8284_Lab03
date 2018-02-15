package cst8284.calculator;

public class Complex {
	private double real = 0;
	private double imag = 0;
	
	
	// Complex constructor that takes in a single string, e.g. "2-4i"
	public Complex(String cStr){
		this(cStr.split("(?=\\+)|(?=\\-)"));  // splits cStr at + or - into an array of strings having two elements
		// The first element of the resultant array will be the real portion, 
		// while the second is the imaginary portion.  This array is passed to the next constructor.
	}
	
	
	// Complex constructor that takes in an array of two strings from the above constructor
	// e.g. cStr[0]="2", cStr[1]="-4i"
	public Complex(String[] cStr){
	  this(cStr[0], cStr[1]);
		// TODO: chain the input from this constructor to the next constructor, that is, pass
		// each element of the array to the next constructor, which has a (String, String) signature.
	}

	
	// Complex constructor that takes two separate strings as parameters, e.g. "2" and "-4i"
	public Complex(String r, String i){
	  this(Integer.parseInt(r), Integer.parseInt(i.replaceAll("i","")));
		//TODO: chain the input from this constructor to the next constructor, which has an (int, int) signature
		// Note that this constructor needs to strip the 'i' from the string storing 
		// the imaginary number; it must pass only an integer to the next constructor, 
		// otherwise an error results
	}
	
	
	// Complex constructor that takes in two ints as parameters, e.g. 2 and -4
	public Complex(int r, int i){
	  this((double) r, (double) i);
		//chain the input from this constructor to the next constructor,
		// which has a (double, double) signature
	}
	
	// Complex constructor that takes in two ints and stores them as floats, e.g. as 2.0 and -4.0
	public Complex(double r, double i){
		this.setReal(r);
		this.setImag(i);
	}
	
	//default Complex constructor; it should chain automatically 
	public Complex(){this(0,0);	}
	
	//getReal() that returns the real value of the Complex number
	public double getReal() {return this.real;}
	
	//getImag() that returns the imaginary value of the Complex number
	public double getImag() {return this.imag;}
	
	//setReal() that sets this class's real value equal to the parameter passed to the method
	public void setReal(double real) {this.real = real;}
	
	//setImag() that sets this class's imaginary value equal to the parameter passed to the method
	public void setImag(double imag) {this.imag = imag;}
	
	//getComplex() that returns this Complex number itself.  
	//NOTE: you must return a Complex type, not a String type.
	public Complex getComplex() {return this;} 
	
  //toString() that returns a string in the form "a + Bi" or "a - Bi" depending
	// on whether B is positive or negative.  (For example, it wouldn't make sense to return 3.0 +-2.0i; 
	// when the output should be 3.0 - 2.0i.)
  public String toString() {
    String realPart = Double.toString(this.getReal());
    String sign = this.getImag() >= 0 ? " + " : " - ";
    String imagPart =  Double.toString(Math.abs(this.getImag())) + "i";
    return realPart + sign + imagPart;
  }
	
	// OPTIONAL TODO: if attempting Bonus A, put your public isZero() method, with 
	// one-line return statement, here.  Be sure to use it in your divide() method
		
	
	//OPTIONAL TODO: if attempting Bonus C, write the method to return the complex conjugate of
	// this Complex number.  Use the public conjugate() method with the complex multiplication to 
	// perform the division as explained in the Bonus section, rather than using the equation 
	// for division given in the Appendix.
	


}
