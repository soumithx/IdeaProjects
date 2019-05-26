object ScalaFib extends App{


    def fib(n: Int): Int = {

      def calFib(n: Int, pre: Int, cur: Int): Int = {
        if (n == 0)
          pre
        else
          calFib(n - 1, cur, cur + pre)
      }

      calFib(n, 0, 1)

    }

    for (i <- 1 to 10) {
      println(fib(i))
    }
  }