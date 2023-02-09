package com.guhe.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author njl
 * @date 2023/2/9
 */
@SuppressWarnings("ALL")
public class OrcKing {
	// 处理方法链
	private List<RequestHandler> handlers;

	public OrcKing() {
		buildChain();
	}

	private void buildChain() {
		handlers = Arrays.asList(new OrcCommander(), new OrcOfficer(), new OrcSoldier(), new OrcCommander2());
	}

	public void dispatchRequest(Request request) {
		handlers
				.stream()
				.filter(handler -> handler.canHandle(request))
				.sorted(Comparator.comparing(RequestHandler::getPriority))
				.findFirst()
				.ifPresent(requestHandler -> requestHandler.handle(request));
	}
}
