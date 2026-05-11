# 🌿 Vademécum Antroposófico — Versión Web (Vaadin)

App web construida con Vaadin + Spring Boot. Corre en el navegador en `localhost:8080`.

---

## ✅ Requisitos previos

| Herramienta | Versión mínima | Dónde bajar |
|---|---|---|
| Java JDK | **17 o superior** | https://adoptium.net |
| IntelliJ IDEA | Community o Ultimate | https://www.jetbrains.com/idea |
| Maven | Viene con IntelliJ | — |

Para verificar tu Java: abrir terminal y ejecutar `java -version`

---

## 🚀 Cómo abrir en IntelliJ

1. `File → Open` → seleccionar la carpeta `vademecum-web/`
2. IntelliJ detecta el `pom.xml` automáticamente → clic en **"Load Maven Project"**
3. Esperar que descargue las dependencias (primera vez tarda 2–5 minutos)
4. Abrir `VademecumApplication.java`
5. Clic en el botón ▶ verde junto al método `main`
6. Abrir el navegador en: **http://localhost:8080**

---

## 📁 Estructura del proyecto

```
vademecum-web/
├── pom.xml                          ← Dependencias Maven (Vaadin + Spring Boot)
└── src/main/java/com/vademecum/
    ├── VademecumApplication.java    ← Punto de entrada Spring Boot
    ├── model/
    │   └── Medicamento.java         ← Modelo de datos (igual al desktop)
    ├── data/
    │   └── MedicamentosData.java    ← Base de datos de medicamentos
    ├── service/
    │   └── BuscadorService.java     ← Lógica de búsqueda
    └── ui/
        └── MainView.java            ← Vista principal Vaadin (toda la UI)
```

---

## ➕ Agregar medicamentos

Igual que en la versión de escritorio: editar `MedicamentosData.java` y agregar entradas.

---

## 🎨 Cambiar colores

Los colores están como strings CSS directamente en `MainView.java`.
Buscar por el color (ej. `#2D4A2B`) y reemplazar.

Colores principales actuales:
- Header / botones: `#2D4A2B` (verde botella Weleda)
- Acento dorado: `#A27C40`
- Fondo: `#FAF7EF` (marfil)
- Superficie: `#FFFDF8` (blanco roto)

---

## ⚠️ Aviso legal

Solo para uso profesional médico y farmacéutico como herramienta de consulta.
No reemplaza el criterio clínico ni las fichas técnicas oficiales.
