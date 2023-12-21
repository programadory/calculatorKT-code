import java.util.Scanner 
import platform.posix.system 

fun readNum(): Int {

  val numRD = Scanner(System.`in`)
  return numRD.nextInt()
}

fun main(){
  
  val intro = """
  -------------------
  | CALCULADORA *-* |
  |   + - * / %     |
  -------------------
  """
  println(intro)
  
  print("N1: ")
  val n1: Int = readNum()
  
  print("\nN2: ")
  val n2: Int =  readNum()
  
  system("clear")
  
  print("\nOperacao [+] [-] [*] [/] [%] > ")
  val operation = readLine()
  
  if((n1 < 0  || n2 < 0) && (operation == "/" || operation == "%")){ println("\nNumeros negativos nao aceitos para [/] & [%]\n")
  }
  else{
      val result = when(operation) {
                  
                  "+" -> n1+n2
                  "-" -> n1-n2
                  "*" -> n1*n2
                  "/" -> n1/n2
                  "%" -> n1%n2
                  else -> "Operacao invalidada!\nAs operacoes disponiveis sao: [+] [-] [*] [/] [%]\n"
      }
      println("\nValores $n1 $operation $n2 = $result\n")
    }
}