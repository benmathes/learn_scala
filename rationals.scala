class Rational(n: Int, d: Int) {
  require(d!=0, "divide by zero error")
  override def toString = n + "/" + d

  val num: Int = n
  val den: Int = d

  def +(that: Rational): Rational = {
    new Rational(num * that.num + that.num * den, den * that.den)
  }
}

val added = new Rational(2,3) + new Rational(3,4)

implicit def iToR(i: Int) : Rational = new Rational(i, 1)

println(3 + new Rational(3,5))
