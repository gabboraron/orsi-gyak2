# Feladat

A kliens küldjön át sorban egész számokat a szervernek. A számokat a kliens egy fájlból olvassa be. A szerver mindegyik számra meghív egy függvényt, ami egész számot készít (mondjuk `n ↦ 2*n+1`), majd az eredményt visszaküldi a kliensnek. A kliens a visszakapott eredményeket egy fájlba írja ki sorban. Ha a `0` szám következne a kliensoldalon, akkor a kliens kilép.

* A kliens most küldje át az összes adatot a szervernek, és csak utána fogadja a visszaérkező számokat; hasonlóan, a szerver fogadja az összes számot, és csak utána küldje el őket átalakítva a kliensnek.

* A szerver várakozzon a kliens kilépése után új kliensre, és ez ismétlődjön a végtelenségig.
