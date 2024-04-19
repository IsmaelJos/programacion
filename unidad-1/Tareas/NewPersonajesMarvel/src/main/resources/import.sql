INSERT INTO Personajes (nombre, genero) VALUES 
    ('Iron Man', 'Masculino'),
    ('Spider-Man', 'Masculino');

INSERT INTO Alias (personaje_id, alias) VALUES 
    (1, 'Tony Stark'),
    (2, 'Peter Parker');

INSERT INTO Poderes (poder) VALUES 
    ('Vuelo'),
    ('Armadura tecnológica avanzada'),
    ('Rayos láser'),
    ('Agilidad sobrehumana'),
    ('Trepamuros'),
    ('Sentido arácnido');

INSERT INTO Personajes_Poderes (personaje_id, poder_id) VALUES 
    (1, 1),
    (1, 2),
    (1, 3),
    (2, 4),
    (2, 5),
    (2, 6);