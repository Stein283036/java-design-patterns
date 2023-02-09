package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/9
 */
public class OrcSoldier implements RequestHandler {
	@Override
	public boolean canHandle(Request request) {
		return request.getRequestType() == RequestType.TORTURE_PRISONER;
	}

	@Override
	public int getPriority() {
		return 4;
	}

	@Override
	public void handle(Request request) {
		request.markHandled();
		System.out.println(name() + " handles request " + request);
	}

	@Override
	public String name() {
		return "Orc Soldier";
	}
}
