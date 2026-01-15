--
-- PostgreSQL database dump
--

\restrict lIiyEBdvbG6D8j0Wsut4UetE01jea5yfg4o5Egy506vS5XLIfZal4wsG5eBvJll

-- Dumped from database version 18.1
-- Dumped by pg_dump version 18.1

-- Started on 2026-01-13 13:11:02

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 220 (class 1259 OID 16732)
-- Name: categoria; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.categoria (
    id_cat bigint NOT NULL,
    nombre_cat character varying(100) NOT NULL
);


ALTER TABLE public.categoria OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16731)
-- Name: categoria_id_cat_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.categoria_id_cat_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.categoria_id_cat_seq OWNER TO postgres;

--
-- TOC entry 5068 (class 0 OID 0)
-- Dependencies: 219
-- Name: categoria_id_cat_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.categoria_id_cat_seq OWNED BY public.categoria.id_cat;


--
-- TOC entry 222 (class 1259 OID 16741)
-- Name: estado_proyecto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.estado_proyecto (
    id_est bigint NOT NULL,
    nombre_est character varying(100) NOT NULL
);


ALTER TABLE public.estado_proyecto OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16740)
-- Name: estado_proyecto_id_est_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.estado_proyecto_id_est_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.estado_proyecto_id_est_seq OWNER TO postgres;

--
-- TOC entry 5069 (class 0 OID 0)
-- Dependencies: 221
-- Name: estado_proyecto_id_est_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.estado_proyecto_id_est_seq OWNED BY public.estado_proyecto.id_est;


--
-- TOC entry 224 (class 1259 OID 16750)
-- Name: icono; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.icono (
    id_ico bigint NOT NULL,
    url_ico character varying(250) NOT NULL
);


ALTER TABLE public.icono OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 16749)
-- Name: icono_id_ico_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.icono_id_ico_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.icono_id_ico_seq OWNER TO postgres;

--
-- TOC entry 5070 (class 0 OID 0)
-- Dependencies: 223
-- Name: icono_id_ico_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.icono_id_ico_seq OWNED BY public.icono.id_ico;


--
-- TOC entry 226 (class 1259 OID 16759)
-- Name: proyecto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.proyecto (
    id_pro bigint NOT NULL,
    codigo_pro character varying(20) NOT NULL,
    nombre_pro character varying(100) NOT NULL,
    descripcion_pro text NOT NULL,
    fecha_inicio_pro date NOT NULL,
    fecha_fin_pro date NOT NULL,
    id_cat integer NOT NULL,
    id_ico integer NOT NULL,
    id_est integer NOT NULL
);


ALTER TABLE public.proyecto OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 16758)
-- Name: proyecto_id_pro_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.proyecto_id_pro_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.proyecto_id_pro_seq OWNER TO postgres;

--
-- TOC entry 5071 (class 0 OID 0)
-- Dependencies: 225
-- Name: proyecto_id_pro_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.proyecto_id_pro_seq OWNED BY public.proyecto.id_pro;


--
-- TOC entry 228 (class 1259 OID 16777)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    id_usu bigint NOT NULL,
    email_usu character varying(150) NOT NULL,
    password_usu character varying(50) NOT NULL,
    nombre_usu character varying(100) NOT NULL,
    apellido_usu character varying(100) NOT NULL,
    telefono character varying(20) NOT NULL,
    cargo_usu character varying(100) NOT NULL,
    empresa_usu character varying(100) NOT NULL,
    foto_url_usu character varying(250) NOT NULL
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 16776)
-- Name: usuario_id_usu_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuario_id_usu_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.usuario_id_usu_seq OWNER TO postgres;

--
-- TOC entry 5072 (class 0 OID 0)
-- Dependencies: 227
-- Name: usuario_id_usu_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuario_id_usu_seq OWNED BY public.usuario.id_usu;


--
-- TOC entry 230 (class 1259 OID 24595)
-- Name: usuario_proyecto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario_proyecto (
    id_usu_pro bigint NOT NULL,
    id_usu integer NOT NULL,
    id_pro integer NOT NULL,
    fecha_asignacion timestamp without time zone NOT NULL
);


ALTER TABLE public.usuario_proyecto OWNER TO postgres;

--
-- TOC entry 229 (class 1259 OID 24594)
-- Name: usuario_proyecto_id_usu_pro_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuario_proyecto_id_usu_pro_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.usuario_proyecto_id_usu_pro_seq OWNER TO postgres;

--
-- TOC entry 5073 (class 0 OID 0)
-- Dependencies: 229
-- Name: usuario_proyecto_id_usu_pro_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuario_proyecto_id_usu_pro_seq OWNED BY public.usuario_proyecto.id_usu_pro;


--
-- TOC entry 4881 (class 2604 OID 16735)
-- Name: categoria id_cat; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categoria ALTER COLUMN id_cat SET DEFAULT nextval('public.categoria_id_cat_seq'::regclass);


--
-- TOC entry 4882 (class 2604 OID 16744)
-- Name: estado_proyecto id_est; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estado_proyecto ALTER COLUMN id_est SET DEFAULT nextval('public.estado_proyecto_id_est_seq'::regclass);


--
-- TOC entry 4883 (class 2604 OID 16753)
-- Name: icono id_ico; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.icono ALTER COLUMN id_ico SET DEFAULT nextval('public.icono_id_ico_seq'::regclass);


--
-- TOC entry 4884 (class 2604 OID 16762)
-- Name: proyecto id_pro; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proyecto ALTER COLUMN id_pro SET DEFAULT nextval('public.proyecto_id_pro_seq'::regclass);


--
-- TOC entry 4885 (class 2604 OID 16780)
-- Name: usuario id_usu; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario ALTER COLUMN id_usu SET DEFAULT nextval('public.usuario_id_usu_seq'::regclass);


--
-- TOC entry 4886 (class 2604 OID 24598)
-- Name: usuario_proyecto id_usu_pro; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario_proyecto ALTER COLUMN id_usu_pro SET DEFAULT nextval('public.usuario_proyecto_id_usu_pro_seq'::regclass);


--
-- TOC entry 4896 (class 2606 OID 16793)
-- Name: usuario PK1; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT "PK1" PRIMARY KEY (id_usu);


--
-- TOC entry 4898 (class 2606 OID 24604)
-- Name: usuario_proyecto PK14; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario_proyecto
    ADD CONSTRAINT "PK14" PRIMARY KEY (id_usu_pro);


--
-- TOC entry 4894 (class 2606 OID 16775)
-- Name: proyecto PK2; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proyecto
    ADD CONSTRAINT "PK2" PRIMARY KEY (id_pro);


--
-- TOC entry 4890 (class 2606 OID 16748)
-- Name: estado_proyecto PK4; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estado_proyecto
    ADD CONSTRAINT "PK4" PRIMARY KEY (id_est);


--
-- TOC entry 4888 (class 2606 OID 16739)
-- Name: categoria PK5; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categoria
    ADD CONSTRAINT "PK5" PRIMARY KEY (id_cat);


--
-- TOC entry 4892 (class 2606 OID 16757)
-- Name: icono PK6; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.icono
    ADD CONSTRAINT "PK6" PRIMARY KEY (id_ico);


--
-- TOC entry 4899 (class 2606 OID 16804)
-- Name: proyecto Refcategoria261; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proyecto
    ADD CONSTRAINT "Refcategoria261" FOREIGN KEY (id_cat) REFERENCES public.categoria(id_cat);


--
-- TOC entry 4900 (class 2606 OID 16814)
-- Name: proyecto Refestado_proyecto321; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proyecto
    ADD CONSTRAINT "Refestado_proyecto321" FOREIGN KEY (id_est) REFERENCES public.estado_proyecto(id_est);


--
-- TOC entry 4901 (class 2606 OID 16809)
-- Name: proyecto Reficono301; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proyecto
    ADD CONSTRAINT "Reficono301" FOREIGN KEY (id_ico) REFERENCES public.icono(id_ico);


--
-- TOC entry 4902 (class 2606 OID 24610)
-- Name: usuario_proyecto Refproyecto371; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario_proyecto
    ADD CONSTRAINT "Refproyecto371" FOREIGN KEY (id_pro) REFERENCES public.proyecto(id_pro);


--
-- TOC entry 4903 (class 2606 OID 24605)
-- Name: usuario_proyecto Refusuario361; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario_proyecto
    ADD CONSTRAINT "Refusuario361" FOREIGN KEY (id_usu) REFERENCES public.usuario(id_usu);


-- Completed on 2026-01-13 13:11:03

--
-- PostgreSQL database dump complete
--

\unrestrict lIiyEBdvbG6D8j0Wsut4UetE01jea5yfg4o5Egy506vS5XLIfZal4wsG5eBvJll

