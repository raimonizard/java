# Exercici 1
Crea una aplicació amb java usant **programació modular** que permeti a l'usuari introduïr les notes de l'examen de M04-UF1. **Una nota per cada alumne**
Usarem vectors dinàmics que ens permetin la flexibilitat d'introduïr el nombre de notes que volguem.
Usarem un ArrayList de tipus Float. Seva declaració és:
```java
ArrayList<Float> notesAlumnes = new ArrayList<>();
```
Per saber la longitud en cada moment de l'ArrayList, usarem **ArrayList.size()**
L'aplicació ha de tenir un menú principal amb control d'errors (que podeu copiar d'algun altre projecte) i ha de permetre les següents opcions:
1. Introduïr nota al final del llistat **ArrayList.add()**
2. Consultar la nota d'un índex **ArrayList.get()**
3. Eliminar una nota en un índex **ArrayList.remove()**
4. Modificar la nota en un índex **ArrayList.set()**
5. Sortir

**Extra** : Crear un altre ArrayList de tipus <String> que permeti guardar el nom dels alumnes i així poder saber a qui correspon cada nota.