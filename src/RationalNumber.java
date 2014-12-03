// Write a class called RationalNumber that represents a fraction with an integer numerator and denominator
public class RationalNumber
{
  int num;
  int denom;
  
  public RationalNumber()
  {
    num = 0;
    denom = 1;
  }
  public int GreatestCommonDivisor(int first, int second) {
    int temp;
    while (second != 0)
    {
        temp = second;
        second = first % second;
        first = temp;
    }        
    return first;
}    
  public RationalNumber(int numerator, int denominator)
  {
     if(denominator==0)
    {
      denominator=1;
    }
    num = num/GreatestCommonDivisor(num,denom);
    denom = num/GreatestCommonDivisor(num,denom);
  }
  public int getDenominator()
  {
    return denom;
  }
  public int getNumerator()
  {
    return num;
  }
  public String toString()
  {
    String s = " ";
    num = num/GreatestCommonDivisor(num,denom);
    denom = num/GreatestCommonDivisor(num,denom);
    
    if(denom==1)
    {
      s = Integer.toString(num);
    }
    else
    {
      s = num + "/" + denom;
    }
    return s;  
  }
  public void add(RationalNumber frac)
  {
    num = num * frac.getDenominator() + frac.getNumerator() * denom;
    denom = denom * frac.getDenominator();
  }
  public void subtract(RationalNumber frac)
  {
    num = num * frac.getDenominator() - frac.getNumerator() * denom; 
    denom = denom * frac.getDenominator();
  }
  public void multiply(RationalNumber frac)
  {
    num = num * frac.getNumerator();
    denom = denom * frac.getDenominator();
  }
  public void divide(RationalNumber frac)
  {
    num = num * frac.getDenominator();
    denom = denom * frac.getNumerator();
  }
}

      
    
    
    
  
   
    
