package br.com.ondev.exception;

import br.com.ondev.dto.BasicResponseDTO;

public class ValidacaoException extends RuntimeException {

	private static final long serialVersionUID = -4533458434468837619L;

	private BasicResponseDTO basicResponse;

	public ValidacaoException(BasicResponseDTO basicResponse) {
		this.basicResponse = basicResponse;
	}

	public ValidacaoException(BasicResponseDTO basicResponse, Throwable t) {
		super(t);
		this.basicResponse = basicResponse;
	}

	public BasicResponseDTO getBasicResponse() {
		return basicResponse;
	}
}
