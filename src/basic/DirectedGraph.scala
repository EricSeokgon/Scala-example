package basic

/**
  * Project: Scala-example
  * FileName: DirectedGraph
  * Date: 2016-02-22
  * Time: 오전 12:21
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
abstract class DirectedGraph extends Graph {
  type Edge <: EdgeImpl
  class EdgeImpl(origin: Node, dest: Node) {
    def from = origin
    def to = dest
  }
  class NodeImpl extends NodeIntf {
    def connectWith(node: Node): Edge = {
      val edge = newEdge(this, node)
      edges = edge :: edges
      edge
    }
  }
  protected def newNode: Node
  protected def newEdge(from: Node, to: Node): Edge
  var nodes: List[Node] = Nil
  var edges: List[Edge] = Nil
  def addNode: Node = {
    val node = newNode
    nodes = node :: nodes
    node
  }
}