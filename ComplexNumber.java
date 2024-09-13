class ComplexNumber {
 double real, imag;
 ComplexNumber(double r, double i) { real = r; imag = i; }

  ComplexNumber add(ComplexNumber o) { return new ComplexNumber(real + o.real, imag + o.imag); }

  ComplexNumber sub(ComplexNumber o) { return new ComplexNumber(real - o.real, imag - o.imag); }

  ComplexNumber mul(ComplexNumber o) { 
  return new ComplexNumber(real * o.real - imag * o.imag, real * o.imag + imag * o.real); 
  }

  ComplexNumber conj() { return new ComplexNumber(real, -imag); }

 public String toString() { return imag >= 0 ? real + " + " + imag + "i" : real + " - " + (-imag) + "i"; }

public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(3, 4), n2 = new ComplexNumber(1, -2);
        System.out.println("n1: " + n1 + "\nn2: " + n2 + "\nSum: " + n1.add(n2) + "\nDifference: " + n1.sub(n2) + "\nProduct: " + n1.mul(n2) + "\nConjugate of n1: " + n1.conj() + "\nConjugate of n2: " + n2.conj());
}
}