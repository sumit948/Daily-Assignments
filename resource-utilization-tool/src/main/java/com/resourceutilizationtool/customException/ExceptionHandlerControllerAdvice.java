package com.resourceutilizationtool.customException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.resourceutilizationtool.utils.Constants;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	private static final Logger log = LoggerFactory.getLogger(ExceptionHandlerControllerAdvice.class);

	private static final String EXCEPTION = "Exception Message ::,{}";

	@ExceptionHandler(RecordAlreadyExistException.class)
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public @ResponseBody ExceptionResponse handleRecordAlreadyExistException(
		final RecordAlreadyExistException exception, final HttpServletRequest request) {
		ExceptionResponse error = new ExceptionResponse();
		error.setMessage(exception.getMessage());
		error.setPath(request.getRequestURI());
		error.setStatus(Constants.CustomCodes.RECORD_ALREADY_EXISTS.getCode());
		log.warn(EXCEPTION, error);
		return error;
	}

	@ExceptionHandler(BadRequestException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody ExceptionResponse handleBadRequestException(final BadRequestException exception,
		final HttpServletRequest request) {
		ExceptionResponse error = new ExceptionResponse();
		error.setMessage(exception.getMessage());
		error.setPath(request.getRequestURI());
		error.setStatus(Constants.CustomCodes.RECORD_NOT_FOUND.getCode());
		log.warn(EXCEPTION, error);
		return error;
	}

	@ExceptionHandler(RecordNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionResponse handleRecordNotFoundException(final RecordNotFoundException exception,
		final HttpServletRequest request) {
		ExceptionResponse error = new ExceptionResponse();
		error.setMessage(exception.getMessage());
		error.setPath(request.getRequestURI());
		error.setStatus(Constants.CustomCodes.RECORD_NOT_FOUND.getCode());
		log.warn(EXCEPTION, error);
		return error;
	}

	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleInternalServerNullPointerException(final HttpServletRequest request,
		NullPointerException e) {
		ExceptionResponse error = new ExceptionResponse();
		error.setMessage("We are unable to process your request, please try again later.");
		error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setPath(request.getRequestURI());
		log.error("InternalServerNullPointer in {},{},{}", e.getClass(), error, e);
		return error;
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleInternalServerException(final HttpServletRequest request,
		Exception e) {
		ExceptionResponse error = new ExceptionResponse();
		error.setMessage(e.getMessage());
		error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setPath(request.getRequestURI());
		log.error("InternalServerException in {},{},{}", e.getClass(), error, e);
		return error;
	}
}
