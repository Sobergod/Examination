package com.luas.tms.util;

public class InvokeResult<T> {
	private T result;
	private boolean success;
	private String exceptionCode;
	private String exceptionMessage;

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public InvokeResult(T result, boolean success, String exceptionCode,
			String exceptionMessage) {
		super();
		this.result = result;
		this.success = success;
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = exceptionMessage;
	}

	public InvokeResult(T result) {
		super();
		this.result = result;
		this.success = true;
		this.exceptionCode = null;
		this.exceptionMessage = null;
	}

	public InvokeResult(String exceptionCode, String exceptionMessage) {
		super();
		this.result = null;
		this.success = false;
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = exceptionMessage;
	}

	public InvokeResult(String exceptionMessage) {
		super();
		this.result = null;
		this.success = false;
		this.exceptionCode = null;
		this.exceptionMessage = exceptionMessage;
	}
	
	public InvokeResult(boolean success) {
		super();
		this.result = null;
		this.success = success;
		this.exceptionCode = null;
		this.exceptionMessage = null;
	}

}
