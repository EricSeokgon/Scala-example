package class

package class

/**
  * Project: Scala-example
  * FileName: Graph
  * Date: 2016-02-03
  * Time: 오전 12:11
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
class Graph {
  class Node {
    var connectedNodes: List[Node] = Nil
    def connectTo(node: Node) {
      if (connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node :: connectedNodes
      }
    }
  }
  var nodes: List[Node] = Nil
  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}
