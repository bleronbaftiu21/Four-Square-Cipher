#  Enkriptimi dhe Dekriptimi përmes Four-Square Cipher - FIEK

## 📌 Përmbledhje e Projektit

Ky projekt paraqet një aplikacion edukativ të ndërtuar për të demonstruar funksionimin e algoritmit **Four-Square Cipher** – një metodë klasike e kriptimit që përdor katër katrorë 5×5 për të enkriptuar dhe dekriptuar tekstin në çifte shkronjash (digrafe). Projekti është zhvilluar në gjuhën Java dhe synon të ilustrojë qartazi procesin e transformimit të një mesazhi të zakonshëm në një mesazh të fshehur dhe anasjelltas.

---

## 📁 Struktura e Projektit

Struktura është e organizuar në mënyrë modulare për lehtësi dhe mirëmbajtje:

### `src/main/java/com/example/foursquare:`
Përmban klasat kryesore të logjikës së aplikacionit.

- **Main.java**  
  ➤ Pika hyrëse e aplikacionit – merr inputin nga përdoruesi dhe afishon rezultatin e enkriptimit/dekriptimit.

- **FourSquareCipher.java**  
  ➤ Përmban logjikën qendrore të algoritmit për enkriptim dhe dekriptim të tekstit.

- **Square.java**  
  ➤ Ndërton rrjetin 5×5 për çdo fjalë kyçe, duke shmangur përsëritjet dhe duke përjashtuar shkronjën ‘Q’.

- **TextPreprocessor.java**  
  ➤ Përgatit tekstin për enkriptim: pastron karakteret jo-alfabetike, i ndan në digrafe dhe fut ‘X’ kur është e nevojshme.

---

## 🔐 Si Funksionon?

1. Përdoruesi fut dy fjalë kyçe për ndërtimin e dy katrorëve të kodimit.
2. Teksti i dhënë përgatitet dhe ndahet në çifte shkronjash.
3. Kryhet procesi i enkriptimit sipas pozicioneve në katrorët e algoritmit.
4. Enkriptimi mund të kthehet mbrapsht për të rikuperuar tekstin origjinal (dekriptim).

---

## Qëllimi i Projektit

- Ilustrimi praktik i një teknike klasike të kriptografisë simetrike.
- Zhvillimi i të kuptuarit për algoritme të sigurisë së informacionit.
- Ndarja e punës në mënyrë bashkëpunuese dhe modulariteti në Java.
- Përgatitje e një demo-je funksionale për qëllime akademike.

---

## Punuan:
- Benjamin Voca
- Bledion Zymberi
- Bleron Baftiu
- Blertin Hamza

