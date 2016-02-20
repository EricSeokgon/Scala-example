package basic

/**
  * Project: Scala-example
  * FileName: Graph
  * Date: 2016-02-21
  * Time: 오전 3:49
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
abstract class Graph {
  type Edge
  type Node <: NodeIntf
  abstract class NodeIntf {
    def connectWith(node: Node): Edge
  }
  def nodes: List[Node]
  def edges: List[Edge]
  def addNode: Node
}
