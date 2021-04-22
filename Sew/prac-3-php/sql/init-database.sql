DROP TABLE IF EXISTS users;
CREATE TABLE users
(
  `id`         INTEGER PRIMARY KEY,
  `name`       VARCHAR(60) NOT NULL,
  `user`       VARCHAR(30) NOT NULL,
  `password`   VARCHAR(40) NOT NULL,
  `created_at` INTEGER     NOT NULL
);

DROP TABLE IF EXISTS blogs;
CREATE TABLE blogs
(
  `id`         INTEGER PRIMARY KEY,
  `user_id`    INTEGER REFERENCES users (id),
  `title`      VARCHAR(120) NOT NULL,
  `created_at` INTEGER      NOT NULL
);

DROP TABLE IF EXISTS entries;
CREATE TABLE entries
(
  `id`         INTEGER PRIMARY KEY,
  `blog_id`    INTEGER REFERENCES blogs (id),
  `title`      VARCHAR(120) NOT NULL,
  `contents`   TEXT         NOT NULL,
  `created_at` INTEGER      NOT NULL
);

DROP TABLE IF EXISTS comments;
CREATE TABLE comments
(
  `id`         INTEGER PRIMARY KEY,
  `entry_id`   INTEGER REFERENCES entries (id),
  `user_id`    INTEGER REFERENCES users (id),
  `contents`   TEXT    NOT NULL,
  `created_at` INTEGER NOT NULL
);

-- INSERT INTO users (id, name, user, password, created_at)
-- VALUES (1, 'Administrador', 'admin', '704b037a97fa9b25522b7c014c300f8a', 1553100185),
--   (2, 'Sergio Saez', 'ssaez', '6b5f99fc6a3e15b689b9f8a3d1c3765c', 1553107185),
--   (3, 'Pascual Perez', 'pperez', '4ee9c8a2c6d1b7936d20b01c0dcf356a', 1553108185),
--   (4, 'Ismael Ripoll', 'iripoll', 'cfbab4e1c20ad04e72bab3999c2b0ae7', 1553109185);

INSERT INTO users (id, name, user, password, created_at)
VALUES (1, 'Administrador', 'admin', '4dm1n', 1553100185),
  (2, 'Sergio Saez', 'ssaez', 'ssaez00', 1553107185),
  (3, 'Pascual Perez', 'pperez', 'unpassword', 1553108185),
  (4, 'Ismael Ripoll', 'iripoll', 'yomismo', 1553109185);

INSERT INTO blogs (id, user_id, title, created_at)
VALUES (1, 2, 'Historia de unas prácticas de seguridad web', 1553107185),
       (2, 3, 'Seguridad web: de la teoría a la práctica', 1553108185),
       (3, 4, 'Una al dia sobre ciber-seguridad', 1553109185);

INSERT INTO entries (id, blog_id, title, contents, created_at)
VALUES (1, 1, 'Hoy comienzan las prácticas',
        'Esta es la primera entrada del blog. ' ||
        'De momento hay poco que decir. ' ||
        'Ya veremos como van las cosas.',
        1553165574),
       (2, 1, 'El mawk ha dado problemas',
        'Ha habido problemas/confusiones entre el mawk y gawk y el buffer de salida. ' ||
        'Al final se arregla poniendo el mawk en modo interactivo. ' ||
        'Ya lo sabemos para el año que viene.',
        1553166741),
       (3, 2, 'Estrenando asignatura',
        'Simplemente decir que hemos estrenado asignatura. ' ||
        'Ya iremos depurando los contenidos poco a poco. ' ||
        'Paciencia.',
        1553165838),
       (4, 3, 'Hoy no se ha acabado el mundo',
        'Hoy no se ha acabado el mundo, pero seguro que algún administrador web sí que lo ha pensado. ' ||
        'Ya veremos si algunos salen de ésta. ' ||
        'Deberían tener más cuidado a la hora de diseñar páginas web.',
        1553165957);

INSERT INTO comments (id, entry_id, user_id, contents, created_at)
VALUES (1, 1, 3, 'Parece que muchos habían olvidado o no sabían utilizar pipes/fifos en UNIX. ' ||
                 'Habrá que añadir más información para el año que viene.', 1553166296),
       (2, 2, 4, '¿Qué tal si pones en el script que directamente se utilice mawk? ' ||
                 'Si ponemos la orden genérica awk se generán más dudas sobre cuál se va a utilizar. ' ||
                 'Sobre todo cuando el comportamiento y las opciones no son idénticas.', 1553166460);