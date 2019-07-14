package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

/*
 * 处理全局异常捕获处理
 * */

@ControllerAdvice // 控制器切面捕获异常
public class GlobalExceptionHandler {
	/*
	 * // 处理异常方法
	 * 
	 * @ExceptionHandler(RuntimeException.class) // 参数：运行时异常
	 * 
	 * @ResponseBody public Map<String, Object> exceptionHandler() { Map<String,
	 * Object> map = new HashMap<String, Object>(); map.put("errorCode", "101");
	 * map.put("errorMsg", "服务器繁忙"); return map;
	 * 
	 * };
	 */
}
