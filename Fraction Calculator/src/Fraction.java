class Fraction {
    public int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public String toString() {
        return (this.numerator + "/" + this.denominator);
    }

    public double toDouble() {
        return (double) (this.numerator / this.denominator);
    }

    public static int findGCD(int number1, int number2) {
        //base case
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);

    }

    public boolean equals(Fraction oFraction) {
        Fraction f1 = new Fraction(oFraction.numerator, oFraction.denominator);
        Fraction f2 = new Fraction(this.numerator, this.denominator);
        f1.toLowestTerms();
        f2.toLowestTerms();
        if (f1.numerator == f2.numerator && f1.denominator == f2.denominator) {

            System.out.println(toString() + " = " + oFraction + " is true");
            return true;
        }
        System.out.println(toString() + " = " + oFraction + " is false");
        return false;

    }

    public void toLowestTerms() {
        int gcd = findGCD(this.denominator, this.numerator);
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    public Fraction add(Fraction oFraction) {
        int comd = oFraction.denominator * this.denominator; //creates common denominator by multiplying both denominators
        int newNomAnswer = this.numerator * oFraction.denominator + oFraction.numerator * this.denominator;

        Fraction returnFr = new Fraction(newNomAnswer, comd);
        returnFr.toLowestTerms();
        System.out.println(toString() + " + " + oFraction.toString() + " = " + returnFr.toString());
        return returnFr;
    }

    public Fraction subtract(Fraction oFraction) {
        oFraction.numerator = -1 * oFraction.numerator;
        Fraction returnFr = add(oFraction);
        oFraction.numerator = -1 * oFraction.numerator;
        System.out.println(toString() + " -" + oFraction.toString() + " = " + returnFr.toString());
        return returnFr;

    }

    public Fraction multiply(Fraction oFraction) {
        int newNumerator = this.numerator * oFraction.numerator;
        int newDenominator = this.denominator * oFraction.denominator;
        Fraction returnFr = new Fraction(newNumerator, newDenominator);
        System.out.println(toString() + " *" + oFraction.toString() + " = " + returnFr.toString());
        returnFr.toLowestTerms();
        return returnFr;
    }

    public Fraction divide(Fraction oFraction) {
        int num = oFraction.numerator;
        int den = oFraction.denominator;
        oFraction.numerator = den;
        oFraction.denominator = num;
        Fraction returnFr = multiply(oFraction);
        oFraction.numerator = num;
        oFraction.denominator = den;
        System.out.println(toString() + " /" + oFraction.toString() + " = " + returnFr.toString());
        return returnFr;

    }

}
