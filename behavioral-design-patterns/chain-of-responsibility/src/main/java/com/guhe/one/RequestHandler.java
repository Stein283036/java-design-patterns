package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/9
 */
public interface RequestHandler {
	boolean canHandle(Request request);

	int getPriority();

	void handle(Request request);

	String name();
}
