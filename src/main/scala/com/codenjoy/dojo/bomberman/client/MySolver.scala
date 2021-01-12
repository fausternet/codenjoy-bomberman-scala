package com.codenjoy.dojo.bomberman.client

import com.codenjoy.dojo.client.{Solver, WebSocketRunner}

class MySolver extends Solver[MyBoard] {
  var ticks: Int = 0

  override def get(b: MyBoard): String = {
    nextMove.toString
  }

  /*
      Implement your logic here
   */
  def nextMove: Action =
    Action(Right, BombBeforeMove)

}

object Main extends App {
  val url = "http://bomberman.savytskyivasyl.com/codenjoy-contest/board/player/fgfbgffvfdsf?code=03453454355"
  override def main(args: Array[String]): Unit = {
    WebSocketRunner.runClient(url, new MySolver, new MyBoard)
  }
}
