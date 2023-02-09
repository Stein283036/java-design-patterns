package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/9
 */
public class OrcOfficer implements RequestHandler {
	@Override
	public boolean canHandle(Request request) {
		return request.getRequestType() == RequestType.COLLECT_TAX;
	}

	@Override
	public int getPriority() {
		return 3;
	}

	@Override
	public void handle(Request request) {
		request.markHandled();
		System.out.println(name() + " handles request " + request);
	}

	@Override
	public String name() {
		return "Orc Officer";
	}
}
