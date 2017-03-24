package br.com.ondev.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.ondev.enums.EBusinessCode;

@XmlRootElement
public class BasicResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int stats;
	private String message;
	private Integer code;
	private Object entity;

	public BasicResponseDTO() {
	}

	public BasicResponseDTO(Integer stats, String mensagemRetorno, Object entity) {
		super();
		this.stats = stats;
		this.message = mensagemRetorno;
		this.entity = entity;
	}

	public BasicResponseDTO(String mensagemRetorno) {
		super();
		this.message = mensagemRetorno;
	}

	public BasicResponseDTO(EBusinessCode businessCode, Object entity) {
		super();
		this.code = businessCode.getCode();
		this.message = businessCode.getMessage();
		this.entity = entity;
	}

	public static BasicResponseDTO createResponse(EBusinessCode businessCode, Object entity) {
		return new BasicResponseDTO(businessCode, entity);
	}

	public static BasicResponseDTO createResponse(String message) {
		return new BasicResponseDTO(message);
	}

	public int getStats() {
		return stats;
	}

	public void setStats(int stats) {
		this.stats = stats;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getEntity() {
		return entity;
	}

	public void setEntity(Object entity) {
		this.entity = entity;
	}

}
