package com.guhe.one;

import java.util.Objects;

/**
 * @author njl
 * @date 2023/2/9
 */
public class Request {
	private final RequestType requestType;
	private final String description;
	private boolean handled;

	public Request(final RequestType requestType, final String description) {
		this.requestType = Objects.requireNonNull(requestType);
		this.description = Objects.requireNonNull(description);
	}

	public void markHandled() {
		this.handled = true;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public String getDescription() {
		return description;
	}

	public boolean isHandled() {
		return handled;
	}

	@Override
	public String toString() {
		return getDescription();
	}
}
