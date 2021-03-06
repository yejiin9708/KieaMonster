package org.tain.tools.queue;

import org.springframework.stereotype.Component;
import org.tain.tools.node.MonJsonNode;

@Component("MonQueueBox")
public class MonQueueBox {

	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	// queue for sending message
	private MonQueue<MonJsonNode> queueSendResult = new MonQueue<>();
	
	public void setQueueSendResult(MonJsonNode object) {
		this.queueSendResult.set(object);
	}
	
	public MonJsonNode getQueueSendResult() {
		return this.queueSendResult.get();
	}
	
	public void clearQueueSendResult() {
		this.queueSendResult.clear();
	}
	
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	private MonQueue<MonJsonNode> queueSplitCommands = new MonQueue<>();
	
	public void setQueueSplitCommands(MonJsonNode object) {
		this.queueSplitCommands.set(object);
	}
	
	public MonJsonNode getQueueSplitCommands() {
		return this.queueSplitCommands.get();
	}
	
	public void clearQueueSplitCommands() {
		this.queueSplitCommands.clear();
	}
	
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
}
