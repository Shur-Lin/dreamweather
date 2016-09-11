package com.dreamweather.app.util;

/**
 * http请求回调接口
 * 
 * @author Shur
 *
 */
public interface HttpCallbackListener {

	void onFinish(String response);// 结束

	void onError(Exception e);// 错误
}
