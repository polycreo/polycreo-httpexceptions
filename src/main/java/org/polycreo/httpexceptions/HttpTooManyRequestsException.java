/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.polycreo.httpexceptions;

import java.util.Locale;

import lombok.NoArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception to respond HTTP status 429.
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
public class HttpTooManyRequestsException extends HttpResponseException {
	
	/**
	 * Create instance with milliseconds to wait.
	 *
	 * @param millisecsToWait 要待機ミリ秒
	 */
	public HttpTooManyRequestsException(long millisecsToWait) {
		super(String.format(Locale.ENGLISH, "Please wait %d ms before next request", millisecsToWait));
	}
	
	/**
	 * Create instance with detailed message and cause.
	 *
	 * @param message exception message
	 * @param cause cause of exception
	 */
	public HttpTooManyRequestsException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Create instance with detailed message.
	 *
	 * @param message exception message
	 */
	public HttpTooManyRequestsException(String message) {
		super(message);
	}
	
	/**
	 * Create instance with cause.
	 *
	 * @param cause cause of exception
	 */
	public HttpTooManyRequestsException(Throwable cause) {
		super(cause);
	}
}
