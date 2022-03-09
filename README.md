# 06-Procediments
88. Desenvolupar un programa per tal de demanar un conjunt de números pel teclat, finalitzant la
sèrie amb el 0. Una vegada tots els números introduïts caldrà dir per a cada número quin és el seu
factorial. Caldrà desenvolupar els següent mètodes
• int LlegirEnter();
• int factorial(int numero); ‘ El factorial d’un número negatiu es 0

89. Fer un programa on l’usuari anirà introduint números, finalitzant la sèrie amb el 0. Per cada
dos números introduïts s’haurà de mostrar com a resultat si el segon número es divisor del primer
número. Caldrà desenvolupar els següents mètodes
• int LlegirEnter();
• boolean esDivisor(int Divisor, int Divident);

90. Fer un programa on l’usuari anirà introduint números, finalitzant la sèrie amb el 0. Tots els
números s’aniran guardant en una taula i al final caldrà donar com a resultat, el número més gran
de la sèrie, el número més petit, la mitjana i quants son més grans que la mitjana. Caldrà
desenvolupar els següents mètodes
• int Llegirenter();
• int mesGran(int[] valors);
• int mesPetit(int[] valors);
• double mitjana(int[] valors);

91. Fer un programa on l’usuari anirà introduint paraules. Per cada paraula se li mostrarà al usuari
quantes ‘a’ hi ha a la paraula. Cadrà desenvolupar els següents mètodes
• String llegirString();
• int comptarA(String paraula);

92. Igual que l’anterior però caldrà dir quantes ‘a’, ‘e’, ‘i’, ‘o’, ‘u’ per separat hi ha a la paraula.
Caldrà desenvolupar els següents mètodes
• String llegirString();
• int comptarLletra(String paraula, char lletra); ‘ retorna el número de vegades lletra dins de
paraula

93. Igual que l’anterior però caldrà dir quantes lletres diferents s’han introduït per a cada paraula i
per a cada lletra quantes vegades està dins de la paraula. Caldrà desenvolupar els següents
mètodes
• String llegirString();
• char[] lletresDiferents(String paraula); ‘ retorna taula de caràcters amb els caràcters
diferents
• int comptarLletra(String paraula, char lletra); ‘ retorna el número de vegades lletra dins de
paraula
