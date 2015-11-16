package io.strongtyped.funcqrs.akka

import io.strongtyped.funcqrs.{ AggregateAliases, AggregateDef }

trait AutoGeneratedAggregateId {
  this: AggregateManager =>

  def generateId(): Id

  override def processCreation: Receive = {
    case cmd: Command => processAggregateCommand(generateId(), cmd)
  }
}
