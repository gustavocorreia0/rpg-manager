CREATE TABLE public.tb_users (
	id integer GENERATED ALWAYS AS IDENTITY NOT NULL,
	username varchar NULL,
	email varchar NULL,
	"password" varchar NULL,
	"type" varchar NULL,
	birthday date NULL,
	img_profile bytea NULL,
	CONSTRAINT tb_users_pk PRIMARY KEY (id)
);

CREATE TABLE public.tb_characters (
	id integer GENERATED ALWAYS AS IDENTITY NOT NULL,
	"name" varchar NULL,
	"type" varchar NULL,
	"money" float NULL,
	CONSTRAINT tb_characters_pk PRIMARY KEY (id),
	CONSTRAINT tb_characters_tb_users_fk FOREIGN KEY (id) REFERENCES public.tb_users(id)
);

CREATE TABLE public.tb_physical_atributes (
	vitality_points int NOT NULL,
	stamina_points int NOT NULL,
	mana_points int NOT NULL,
    character_id integer NOT NULL,
	CONSTRAINT tb_physical_atributes_tb_characters_fk FOREIGN KEY (character_id) REFERENCES public.tb_characters(id)
);

CREATE TABLE public.tb_history (
	"name" varchar NOT NULL,
	description varchar NULL,
    character_id integer NOT NULL,
	CONSTRAINT history_tb_characters_fk FOREIGN KEY (character_id) REFERENCES public.tb_characters(id)
);

CREATE TABLE public.tb_skills (
	id integer GENERATED ALWAYS AS IDENTITY NOT NULL,
	"name" varchar NOT NULL,
	description varchar NULL,
	stamina_cost int NULL,
	mana_cost int NULL,
	CONSTRAINT tb_skills_pk PRIMARY KEY (id)
);

CREATE TABLE public.tb_itens (
	id integer GENERATED ALWAYS AS IDENTITY NOT NULL,
	"name" varchar NULL,
	description varchar NULL,
	value float
	    NULL,
	CONSTRAINT tb_itens_pk PRIMARY KEY (id)
);

CREATE TABLE public.tb_equipment (
	id integer GENERATED ALWAYS AS IDENTITY NOT NULL,
	"name" varchar NOT NULL,
	description varchar NULL,
	rarity varchar NOT NULL,
	value float NOT NULL,
	CONSTRAINT tb_equipment_pk PRIMARY KEY (id)
);

CREATE TABLE public.tb_genres (
	id integer NOT NULL,
	"name" varchar NOT NULL,
	description varchar NULL,
	CONSTRAINT tb_genres_pk PRIMARY KEY (id)
);

CREATE TABLE public.tb_gametables (
	id integer NOT NULL,
	"name" varchar NOT NULL,
	description varchar NULL,
    genre_id integer NOT NULL,
    user_id integer NOT NULL,
	CONSTRAINT tb_gametables_pk PRIMARY KEY (id),
	CONSTRAINT tb_gametables_tb_genres_fk FOREIGN KEY (genre_id) REFERENCES public.tb_genres(id),
	CONSTRAINT tb_gametables_tb_users_fk FOREIGN KEY (user_id) REFERENCES public.tb_users(id)
);

CREATE TABLE public.tb_sagas (
	id integer GENERATED ALWAYS AS IDENTITY NOT NULL,
	"name" varchar NOT NULL,
	resume varchar NULL,
    gametable_id integer NOT NULL,
	CONSTRAINT tb_sagas_pk PRIMARY KEY (id),
	CONSTRAINT tb_sagas_tb_gametables_fk FOREIGN KEY (gametable_id) REFERENCES public.tb_gametables(id)
);

CREATE TABLE public.tb_chapters (
	id integer NOT NULL,
	"name" varchar NOT NULL,
	"content" varchar NOT NULL,
	CONSTRAINT tb_chapters_pk PRIMARY KEY (id)
);

CREATE TABLE public.tb_places (
	id integer NOT NULL,
	"name" varchar NOT NULL,
	description varchar NULL,
    gametable_id integer NOT NULL,
	CONSTRAINT tb_places_pk PRIMARY KEY (id),
	CONSTRAINT tb_places_tb_gametables_fk FOREIGN KEY (gametable_id) REFERENCES public.tb_gametables(id)
);

CREATE TABLE public.tb_character_skill (
	id integer NULL,
    character_id integer NOT NULL,
    skill_id integer NOT NULL,
	CONSTRAINT tb_character_skill_tb_characters_fk FOREIGN KEY (id) REFERENCES public.tb_characters(id),
	CONSTRAINT tb_character_skill_tb_skills_fk FOREIGN KEY (id) REFERENCES public.tb_skills(id)
);

CREATE TABLE public.tb_character_item (
	id integer NULL,
    character_id integer NOT NULL,
    item_id integer NOT NULL,
	CONSTRAINT tb_character_item_tb_characters_fk FOREIGN KEY (id) REFERENCES public.tb_characters(id),
	CONSTRAINT tb_character_item_tb_itens_fk FOREIGN KEY (id) REFERENCES public.tb_itens(id)
);

CREATE TABLE public.tb_character_equipment (
	id integer NULL,
    character_id integer NOT NULL,
    equipment_id integer NOT NULL,
	CONSTRAINT tb_character_equipment_tb_characters_fk FOREIGN KEY (id) REFERENCES public.tb_characters(id),
	CONSTRAINT tb_character_equipment_tb_equipment_fk FOREIGN KEY (id) REFERENCES public.tb_equipment(id)
);