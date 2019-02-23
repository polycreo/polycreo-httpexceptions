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
package org.ws2ten1.httpexceptions;

import lombok.NoArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception to respond HTTP status 500.
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class HttpInternalServerErrorException extends HttpResponseException {
	
	/**
	 * Create instance.
	 *
	 * @param message the detail message
	 * @param cause the cause
	 * @since 0.3
	 */
	public HttpInternalServerErrorException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Create instance.
	 *
	 * @param message the detail message
	 * @since 0.3
	 */
	public HttpInternalServerErrorException(String message) {
		super(message);
	}
	
	/**
	 * Create instance.
	 *
	 * @param cause the cause
	 * @since 0.3
	 */
	public HttpInternalServerErrorException(Throwable cause) {
		super(cause);
	}
}
