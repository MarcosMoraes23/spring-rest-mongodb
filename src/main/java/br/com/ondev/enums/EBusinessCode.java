package br.com.ondev.enums;

public enum EBusinessCode {

	/* --- Mensagens globais --- */
	SUCESSO(0001,"Sucesso!"),
	SUCESSO_SALVAR(0002,"Registro salvo com sucesso!"),
	SUCESSO_ATUALIZAR(0003,"Registro atualizado com sucesso!"),
	SUCESSO_REMOVER(0004, "Registro removido com sucesso!"),
	
	INTERNAL_ERROR(1005, "Erro de negócio"),
	INTERNAL_ERROR_SALVAR(1006, "Erro ao salvar o registro"),
	INTERNAL_ERROR_ATUALIZAR(1007, "Erro ao atualizar o registro"),
	INTERNAL_ERROR_REMOVER(1008,"Erro ao remover o registro");
	
	private Integer code;
	private String message;
	
	private EBusinessCode(Integer code, String mensagem) {
		this.code = code;
		this.message = mensagem;
	}

	public String getMessage() {
		return message;
	}

	public Integer getCode() {
		return code;
	}
}
