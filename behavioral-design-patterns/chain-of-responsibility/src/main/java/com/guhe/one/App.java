package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/9
 */
public class App {
	public static void main(String[] args) {
		OrcKing orcKing = new OrcKing();
		orcKing.dispatchRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
		orcKing.dispatchRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
		orcKing.dispatchRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
	}
}
