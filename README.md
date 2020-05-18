# qrcode_server
projeto ejb para geração de qrcode nos documentos. 
Tecnologias: Java, Maven, Hibernate, ejb, Zxing api

script para criação da tabela no banco de dados

-- Table: test_qrcode.documento_qrcode

-- DROP TABLE test_qrcode.documento_qrcode;

CREATE TABLE test_qrcode.documento_qrcode
(
    documento_qrcode_id integer NOT NULL,
    campo text COLLATE pg_catalog."default",
    chave text COLLATE pg_catalog."default",
    data_criacao timestamp without time zone,
    tabela text COLLATE pg_catalog."default",
    valor_chave uuid NOT NULL,
    CONSTRAINT documento_qrcode_pkey PRIMARY KEY (documento_qrcode_id),
    CONSTRAINT uk_hroeogtx7f3giyd81ee31qg5b UNIQUE (valor_chave)

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE test_qrcode.documento_qrcode
    OWNER to postgres;
