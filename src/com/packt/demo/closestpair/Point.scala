package com.packt.demo.closestpair

case class Point(x: Int, y: Int) {
  def distanceTo(pt: Point):Double = Math.sqrt(Math.pow(x-pt.x, 2) + Math.pow(y-pt.y, 2))
}
