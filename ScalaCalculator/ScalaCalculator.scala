
class ScalaCalculator {
     var a:Int = 0;
     var b:Int = 0;
     
     def setA(a:Int) {
       this.a = a
     }
     
     def setB(b:Int) {
       this.b = b
     }
     
     def add():Int = {
       a + b
     }
     def sub():Int = {
       a - b
     }
     def mul():Int = {
       a * b
     }
     def div():Int = {
       a / b
     }
     
}